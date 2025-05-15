package com.dev.insurance_middle.infrastructure.config;

import com.dev.generated.policies.ApiClient;
import com.dev.generated.policies.client.PoliciesApi;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class RestClientPolicyConfig {

    @Value("${rest.client.core.policies.host}")
    private String policyHost;

    @Bean("policiesApiClient")
    public ApiClient policyApiClient(RestTemplate restTemplate) {
        ApiClient policyClient = new ApiClient(restTemplate);
        policyClient.setBasePath(policyHost);
        return policyClient;
    }

    @Bean("policiesApi")
    public PoliciesApi policiesApi(@Qualifier("policiesApiClient") ApiClient apiClient) {
        PoliciesApi policiesApi = new PoliciesApi(apiClient);
        policiesApi.setApiClient(apiClient);
        return policiesApi;
    }
}