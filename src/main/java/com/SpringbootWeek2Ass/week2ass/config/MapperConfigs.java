package com.SpringbootWeek2Ass.week2ass.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfigs {

    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }

}
