package com.example.clothingstore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import io.micrometer.common.lang.NonNull;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @SuppressWarnings("null")
            @Override
            public void addCorsMappings(@NonNull CorsRegistry registry) {
                registry.addMapping("/**") // Permetti su tutte le API
                        .allowedOrigins("http://localhost:4200") // Permetti chiamate da Angular
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Permetti tutti i metodi
                        .allowedHeaders("*") // Permetti tutti gli header
                        .allowCredentials(true); // Permetti i cookie/sessioni se serve
            }
        };
    }
}
