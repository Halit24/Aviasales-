package com.aviasales.demo.config;

import com.aviasales.demo.service.Aviasales;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MyConfiguration {

    @Bean
    public Aviasales aviasales() {
        return new Aviasales();
    }
}

