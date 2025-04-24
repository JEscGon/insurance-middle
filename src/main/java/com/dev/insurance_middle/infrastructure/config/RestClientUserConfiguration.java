package com.dev.insurance_middle.infrastructure.config;

import com.dev.generated.users.ApiClient;
import com.dev.generated.users.client.UsersApi;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.web.client.*;

@Configuration
public class RestClientUserConfiguration {

    @Value("${rest.client.core.users.host}")
    private String baseUsersHost;

    @Bean("usersApiClient")
    public ApiClient usersApiClient(RestTemplate restTemplate) {
        var userApiClient = new ApiClient(restTemplate);
        userApiClient.setBasePath(baseUsersHost);
        return userApiClient;
    }

    @Bean("userApi")
    public UsersApi userApi(@Qualifier("usersApiClient") ApiClient apiClient) {
        UsersApi userApi = new UsersApi();
        userApi.setApiClient(apiClient);
        return userApi;
    }

}