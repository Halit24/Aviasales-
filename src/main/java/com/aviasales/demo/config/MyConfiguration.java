package com.aviasales.demo.config;

import com.aviasales.demo.service.Aviasales;
import com.aviasales.demo.service.Notifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.aviasales.demo")
public class MyConfiguration  {

    @Bean
    public Aviasales aviasales() {
        return new Aviasales();
    }

    @Bean
    public Notifier notifier(){
        return new Notifier();
    }


}

