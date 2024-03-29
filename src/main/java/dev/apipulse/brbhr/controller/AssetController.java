package dev.apipulse.brbhr.controller;

import dev.apipulse.brbhr.model.Asset;
import dev.apipulse.brbhr.service.AssetService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/assets")
public class AssetController {

    private final AssetService assetService;

    public AssetController(AssetService assetService) {
        this.assetService = assetService;
    }

    @GetMapping
    public ResponseEntity<List<Asset>> getAllAssets() {
        List<Asset> assets = assetService.getAllAssets();
        return ResponseEntity.ok(assets);
    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<List<Asset>> getAssetsByEmployee(@PathVariable String employeeId) {
        List<Asset> assets = assetService.getAssetsByEmployee(employeeId);
        return ResponseEntity.ok(assets);
    }

    @PostMapping
    public ResponseEntity<Asset> assignAsset(@RequestBody Asset asset) {
        Asset assignedAsset = assetService.assignAsset(asset);
        return new ResponseEntity<>(assignedAsset, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Asset> updateAsset(@PathVariable String id, @RequestBody Asset asset) {
        Asset updatedAsset = assetService.updateAsset(id, asset);
        return ResponseEntity.ok(updatedAsset);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deallocateAsset(@PathVariable String id) {
        assetService.deallocateAsset(id);
        return ResponseEntity.noContent().build();
    }
}
