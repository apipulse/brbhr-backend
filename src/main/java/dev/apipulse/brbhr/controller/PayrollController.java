package dev.apipulse.brbhr.controller;

@RestController
@RequestMapping("/api/payroll")
public class PayrollController {

    private final PayrollService payrollService;

    public PayrollController(PayrollService payrollService) {
        this.payrollService = payrollService;
    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<Payroll> getPayrollByEmployee(@PathVariable Long employeeId) {
        Payroll payroll = payrollService.getPayrollByEmployee(employeeId);
        return ResponseEntity.ok(payroll);
    }

    @PostMapping
    public ResponseEntity<Payroll> processPayroll(@RequestBody Payroll payroll) {
        Payroll processedPayroll = payrollService.processPayroll(payroll);
        return new ResponseEntity<>(processedPayroll, HttpStatus.CREATED);
    }

    @PutMapping("/{employeeId}")
    public ResponseEntity<Payroll> updatePayroll(@PathVariable Long employeeId, @RequestBody Payroll payroll) {
        Payroll updatedPayroll = payrollService.updatePayroll(employeeId, payroll);
        return ResponseEntity.ok(updatedPayroll);
    }
}
