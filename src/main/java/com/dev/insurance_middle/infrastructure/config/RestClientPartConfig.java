package com.dev.insurance_middle.infrastructure.config;

import com.dev.generated.policies.ApiClient;
import com.dev.generated.policies.client.PartsApi;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestClientPartConfig {

    @Value("${rest.client.core.part.host}")
    private String basePartHost;

    @Bean("partsApiClient")
    public ApiClient partApiClient(RestTemplate restTemplate) {
        var partApiClient = new ApiClient(restTemplate);
        partApiClient.setBasePath(basePartHost);
        return partApiClient;
    }

    @Bean("partApi")
    public PartsApi partsApi(@Qualifier("partsApiClient") ApiClient apiClient) {
        PartsApi partsApi = new PartsApi();
        partsApi.setApiClient(apiClient);
        return partsApi;
    }


}
