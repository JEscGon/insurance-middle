package com.dev.insurance_middle.infrastructure.config;

import com.dev.generated.policies.ApiClient;
import com.dev.generated.policies.client.PoliciesApi;
import com.dev.generated.policies.client.PolicyTypesApi;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestClientPoliciesConfiguration {

    @Value("${rest.client.core.policies.host}")
    private String basePoliciesHost;

    @Bean("policiesApiClient")
    public ApiClient policiesApiClient(RestTemplate restTemplate) {
        var policiesApiClient = new ApiClient(restTemplate);
        policiesApiClient.setBasePath(basePoliciesHost);
        return policiesApiClient;
    }

    @Bean("policiesApi")
    public PoliciesApi policiesApi(@Qualifier("policiesApiClient") ApiClient apiClient) {
        PoliciesApi policiesApi = new PoliciesApi();
        policiesApi.setApiClient(apiClient);
        return policiesApi;
    }

    @Bean("policyTypesApi")
    public PolicyTypesApi policyTypesApi(@Qualifier("policiesApiClient") ApiClient apiClient) {
        PolicyTypesApi policyTypesApi = new PolicyTypesApi();
        policyTypesApi.setApiClient(apiClient);
        return policyTypesApi;
    }
}
