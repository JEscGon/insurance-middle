package com.dev.insurance_middle.infrastructure.config;

import com.dev.insurance.middle.generated.policies.ApiClient;
import com.dev.insurance.middle.generated.policies.client.PartsApi;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class PartsApiConfig {
    @Bean
    public PartsApi partsApi(RestTemplateBuilder restTemplateBuilder) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ApiClient apiClient = new ApiClient(restTemplate);
        apiClient.setBasePath("http://localhost:8080");
        return new PartsApi(apiClient);
    }
}
