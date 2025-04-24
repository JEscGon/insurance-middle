package com.dev.insurance_middle.infrastructure.config;

import com.dev.generated.users.ApiClient;
import com.dev.generated.users.client.ThirdVehiclesApi;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestClientThirdVehicleConfig {

    @Value("${rest.client.core.thirdVehicle.host}")
    private String baseThirdVehicleHost;

    @Bean("thirdVehicleApiClient")
    public ApiClient thirdVehicleApiClient(RestTemplate restTemplate) {
        var thirdVehicleApiClient = new ApiClient(restTemplate);
        thirdVehicleApiClient.setBasePath(baseThirdVehicleHost);
        return thirdVehicleApiClient;
    }

    @Bean("thirdVehicleApi")
    public ThirdVehiclesApi thirdVehicleApi(@Qualifier("thirdVehicleApiClient") ApiClient apiClient) {
        ThirdVehiclesApi thirdVehicleApi = new ThirdVehiclesApi();
        thirdVehicleApi.setApiClient(apiClient);
        return thirdVehicleApi;
    }

}
