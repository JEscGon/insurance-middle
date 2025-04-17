package com.dev.insurance_middle.infrastructure.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import com.dev.insurance.middle.generated.users.ApiClient;
import com.dev.insurance.middle.generated.users.client.VehiclesApi;

@Configuration
public class VehiclesApiConfig {
    @Bean
    public VehiclesApi vehiclesApi(RestTemplateBuilder restTemplateBuilder) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ApiClient apiClient = new ApiClient(restTemplate);
        apiClient.setBasePath("http://localhost:8080");
        return new VehiclesApi(apiClient);
    }
}
