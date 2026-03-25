package com.dev.insurance_middle.infrastructure.rest.controller;

import com.dev.insurance_middle.application.domain.Policy;
import com.dev.insurance_middle.application.service.PolicyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/policies")
public class PolicyController {

    private final PolicyService policyService;

    @GetMapping
    public ResponseEntity<List<Policy>> getAllPolicies() {
        return ResponseEntity.ok(policyService.findAllPolicies());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Policy> getPolicyById(@PathVariable Long id) {
        return ResponseEntity.ok(policyService.findPolicyById(id));
    }

    @GetMapping("/dni/{dni}")
    public ResponseEntity<Policy> getPolicyByDni(@PathVariable String dni) {
        return ResponseEntity.ok(policyService.findByDni(dni));
    }

    @GetMapping("/vehicle/{matricula}")
    public ResponseEntity<Policy> getPolicyByMatricula(@PathVariable String matricula) {
        return ResponseEntity.ok(policyService.findByMatricula(matricula));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<Policy> getPolicyByUserId(@PathVariable Long userId) {
        return ResponseEntity.ok(policyService.findByUserId(userId));
    }

    @PostMapping
    public ResponseEntity<Void> savePolicy(@RequestBody Policy policy) {
        policyService.savePolicy(policy);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updatePolicy(@PathVariable Long id, @RequestBody Policy policy) {
        policyService.updatePolicy(id, policy);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePolicy(@PathVariable Long id) {
        policyService.deletePolicy(id);
        return ResponseEntity.noContent().build();
    }
}
