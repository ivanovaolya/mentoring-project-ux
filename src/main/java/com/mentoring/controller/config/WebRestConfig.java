package com.mentoring.controller.config;

import com.mentoring.controller.converter.Converter;
import com.mentoring.controller.converter.UserConverter;

import org.springframework.context.annotation.Bean;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;

/**
 * @author ivanovaolyaa
 * @version 12/12/2017
 */
@Configuration
public class WebRestConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public Converter userConverter() {
        return new UserConverter();
    }

}
