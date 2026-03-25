package com.dev.insurance_middle.infrastructure.repository;

import com.dev.insurance_middle.application.domain.Policy;
import com.dev.insurance_middle.application.repository.PolicyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class PolicyRepositoryRestClientImpl implements PolicyRepository {

    private static final String BASE_URL = "http://insurance-policies:8081";
    private final RestTemplate restTemplate;

    @Override
    public List<Policy> findAll() {
        Policy[] policies = restTemplate.getForObject(BASE_URL + "/policies", Policy[].class);
        return Arrays.asList(policies != null ? policies : new Policy[0]);
    }

    @Override
    public Policy findById(Long id) {
        return restTemplate.getForObject(BASE_URL + "/policies/" + id, Policy.class);
    }

    @Override
    public Policy findByDni(String dni) {
        return restTemplate.getForObject(BASE_URL + "/policies/dni/" + dni, Policy.class);
    }

    @Override
    public Policy findByMatricula(String matricula) {
        return restTemplate.getForObject(BASE_URL + "/policies/vehicle/" + matricula, Policy.class);
    }

    @Override
    public Policy findByUserId(Long userId) {
        return restTemplate.getForObject(BASE_URL + "/policies/user/" + userId, Policy.class);
    }

    @Override
    public void save(Policy policy) {
        restTemplate.postForLocation(BASE_URL + "/policies", policy);
    }

    @Override
    public void update(Long id, Policy policy) {
        restTemplate.put(BASE_URL + "/policies/" + id, policy);
    }

    @Override
    public void delete(Long id) {
        restTemplate.delete(BASE_URL + "/policies/" + id);
    }
}
