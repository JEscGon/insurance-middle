package com.dev.insurance_middle.infrastructure.config;

import com.dev.insurance.middle.generated.policies.ApiClient;
import com.dev.insurance.middle.generated.policies.client.PoliciesApi;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class PoliciesApiConfig {

    @Bean
    public PoliciesApi vehiclesApi(RestTemplateBuilder restTemplateBuilder) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ApiClient apiClient = new ApiClient(restTemplate);
        apiClient.setBasePath("http://localhost:8080");
        return new PoliciesApi(apiClient);
    }

}
