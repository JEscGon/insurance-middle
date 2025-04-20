package com.dev.insurance_middle.application.repository;

import com.dev.insurance_middle.application.domain.User;

public interface UserRepository {

    User findById(Long userId);

}