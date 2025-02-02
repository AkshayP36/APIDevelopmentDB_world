package com.example.apidevelopmentdb_world.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ApplicationConfiguration {

    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
