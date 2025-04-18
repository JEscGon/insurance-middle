package com.dev.insurance_middle.infrastructure.config;

import com.dev.insurance.middle.generated.users.ApiClient;
import com.dev.insurance.middle.generated.users.client.UsersApi;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class UsersApiConfig {
    @Bean
    public UsersApi usersApi(RestTemplateBuilder restTemplateBuilder) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ApiClient apiClient = new ApiClient(restTemplate);
        apiClient.setBasePath("http://localhost:8080");
        return new UsersApi(apiClient);
    }
}
