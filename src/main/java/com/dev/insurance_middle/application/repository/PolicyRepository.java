package com.dev.insurance_middle.application.repository;

import com.dev.insurance_middle.application.domain.Policy;
import java.util.List;

public interface PolicyRepository {

    List<Policy> findAll();
    Policy findById(Long id);
    Policy findByDni(String dni);
    Policy findByMatricula(String matricula);
    Policy findByUserId(Long userId);
    void save(Policy policy);
    void update(Long id, Policy policy);
    void delete(Long id);
}
