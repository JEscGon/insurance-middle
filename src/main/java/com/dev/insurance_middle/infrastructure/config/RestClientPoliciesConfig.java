package com.dev.insurance_middle.infrastructure.config;

import com.dev.generated.policies.ApiClient;
import com.dev.generated.policies.client.PartsApi;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestClientPoliciesConfig {

    @Value("${rest.client.core.policies.host}")
    private String basePoliciesHost;

    @Bean("policiesApiClient")
    public ApiClient policiesApiClient(RestTemplate restTemplate) {
        var policiesApiClient = new ApiClient(restTemplate);
        policiesApiClient.setBasePath(basePoliciesHost);
        return policiesApiClient;
    }

    @Bean("partsApi")
    public PartsApi partsApi(@Qualifier("policiesApiClient") ApiClient apiClient) {
        PartsApi partsApi = new PartsApi();
        partsApi.setApiClient(apiClient);
        return partsApi;
    }

}
