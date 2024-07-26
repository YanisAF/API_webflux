package com.example.__demo_webflux.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class WebClientConfig {

    // permet d'utiliser restTemplate dans toute l'application
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
