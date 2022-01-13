package com.wondertek.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class Test {

    @Bean
    public void con(){
        System.out.println("@Configuration-Bean");
    }
}
