package com.atguigu.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration//标注这个事一个配置类
public class ApplicationContextConfig {

    //添加到容器里面
    @Bean
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }
}
