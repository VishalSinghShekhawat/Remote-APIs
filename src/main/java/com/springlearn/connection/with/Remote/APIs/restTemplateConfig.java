package com.springlearn.connection.with.Remote.APIs;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class restTemplateConfig {

    @Bean
    public RestTemplate getRestTemplatec(RestTemplateBuilder restTemplateBuilder){
        return restTemplateBuilder.build();
    }
}
