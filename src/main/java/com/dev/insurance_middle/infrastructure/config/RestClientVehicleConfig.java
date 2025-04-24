package com.dev.insurance_middle.infrastructure.config;

import com.dev.generated.users.ApiClient;
import com.dev.generated.users.client.VehiclesApi;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestClientVehicleConfig {

    @Value("${rest.client.core.vehicle.host}")
    private String baseVehicleHost;

    @Bean("vehicleApiClient")
    public ApiClient vehicleApiClient(RestTemplate restTemplate) {
        var vehicleApiClient = new ApiClient(restTemplate);
        vehicleApiClient.setBasePath(baseVehicleHost);
        return vehicleApiClient;
    }

    @Bean("vehicleApi")
    public VehiclesApi vehicleApi(@Qualifier("vehicleApiClient") ApiClient apiClient) {
        VehiclesApi vehicleApi = new VehiclesApi();
        vehicleApi.setApiClient(apiClient);
        return vehicleApi;
    }

}
