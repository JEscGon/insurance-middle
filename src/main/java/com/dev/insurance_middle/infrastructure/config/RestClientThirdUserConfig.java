package com.dev.insurance_middle.infrastructure.config;

import com.dev.generated.users.ApiClient;
import com.dev.generated.users.client.ThirdUsersApi;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestClientThirdUserConfig {

    @Value("${rest.client.core.thirdUsers.host}")
    private String baseThirdUsersHost;

    @Bean("thirdUsersApiClient")
    public ApiClient thirdUserApiClient(RestTemplate restTemplate) {
        var thirdUserApiClient = new ApiClient(restTemplate);
        thirdUserApiClient.setBasePath(baseThirdUsersHost);
        return thirdUserApiClient;
    }

    @Bean("thirdUsersApi")
    public ThirdUsersApi thirdUserApi(@Qualifier("thirdUsersApiClient") ApiClient apiClient) {
        ThirdUsersApi thirdUserApi = new ThirdUsersApi();
        thirdUserApi.setApiClient(apiClient);
        return thirdUserApi;
    }

}
