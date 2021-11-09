package com.yl.example;

import com.yl.config.ImportConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @description:
 * @author: xiaoliang
 * @date: 2021/11/5 0:41
 **/
@ComponentScan("com.yl.example")
@Configuration  //<applicationContext.xml
@Import(ImportConfiguration.class)
public class SpringConfiguration {

    @Bean
    public DemoService DemoService(HelloService helloService){
        DemoService DemoService=new DemoService();
        DemoService.setHelloService(helloService);
        return DemoService;
    }

}
