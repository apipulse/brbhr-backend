package dev.apipulse.brbhr.controller;

@RestController
@RequestMapping("/api/careers/internal")
public class InternalCareerController {

    private final CareerService careerService;

    public InternalCareerController(CareerService careerService) {
        this.careerService = careerService;
    }

    @GetMapping
    public ResponseEntity<List<JobPosting>> getInternalJobPostings() {
        List<JobPosting> postings = careerService.getInternalJobPostings();
        return ResponseEntity.ok(postings);
    }

    @PostMapping("/apply/{jobId}")
    public ResponseEntity<Void> applyForJob(@PathVariable Long jobId, @RequestBody JobApplication application) {
        careerService.applyForJob(jobId, application);
        return ResponseEntity.noContent().build();
    }
}
