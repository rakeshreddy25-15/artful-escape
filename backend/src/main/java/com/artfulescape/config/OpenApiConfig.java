package com.artfulescape.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI baseOpenAPI() {
        return new OpenAPI().info(new Info()
                .title("Artful Escape API")
                .version("1.0.0")
                .description("REST API for Artful Escape e-commerce"));
    }
}
