package com.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudGatewayRouting
{
  @Bean
  public RouteLocator configureRoute(RouteLocatorBuilder builder) {
    return builder.routes()
      .route("product-service", r->r.path("/product/**").uri("http://localhost:9091")) //static routing
      .route("coupon-service", r->r.path("/coupon/**").uri("http://localhost:9092")) //dynamic routing : "lb://ORDER-SERVICE"
      .build();
  }
}
