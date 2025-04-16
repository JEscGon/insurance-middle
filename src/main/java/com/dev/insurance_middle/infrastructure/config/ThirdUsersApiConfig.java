package com.dev.insurance_middle.infrastructure.config;

import com.dev.insurance.middle.generated.policies.ApiClient;
import com.dev.insurance.middle.generated.users.client.ThirdUsersApi;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ThirdUsersApiConfig {
    @Bean
    public ThirdUsersApi thirdUsersApi(RestTemplateBuilder restTemplateBuilder) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ApiClient apiClient = new ApiClient(restTemplate);
        apiClient.setBasePath("http://localhost:8081");
        return new ThirdUsersApi();
    }
}
