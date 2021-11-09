package com.yl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: TODO
 * @author: xiaoliang
 * @date: 2021/11/10 1:05
 **/
@Configuration
public class ImportConfiguration {

    @Bean
    public ImportTestService importTestService(){
        return new ImportTestService();
    }
}
