package com.htzw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author gu.lian.jun
 * @version 1.0
 * @date 2020/7/27 16:01
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.htzw.springcloud"})
@ComponentScan("com.htzw.springcloud")
public class DeptConsumer80_Feign_App
{
    public static void main(String[] args)
    {
        SpringApplication.run(DeptConsumer80_Feign_App.class, args);
    }
}
