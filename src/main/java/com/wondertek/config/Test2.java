package com.wondertek.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Test2 {

    @Bean
    public void com(){
        System.out.println("@Component-Bean");
    }
}
