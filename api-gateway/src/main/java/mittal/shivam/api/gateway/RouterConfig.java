/*
package mittal.shivam.api.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * bean config required when working with
 * spring-cloud-starter-gateway-mvc
 * because yml configuration does not work with gateway-mvc and fails with error "A CircuitBreaker must have an id."
 * checkout the bug in library - https://github.com/spring-cloud/spring-cloud-gateway/issues/3327
 */

/*@Configuration
public class RouterConfig {

    @Bean
    public RouteLocator routeConfig(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("USER-SERVICE", r -> r.path("/users/**")
                        .filters(f -> f.circuitBreaker(c -> c.setName("USER-SERVICE")
                                .setFallbackUri("forward:/userServiceFallback")))
                        .uri("lb://USER-SERVICE"))
                .route("DEPARTMENT-SERVICE", r -> r.path("/departments/**")
                        .filters(f -> f.circuitBreaker(c -> c.setName("DEPARTMENT-SERVICE")
                                .setFallbackUri("forward:/departmentServiceFallback")))
                        .uri("lb://DEPARTMENT-SERVICE"))
                .build();
    }
}*/