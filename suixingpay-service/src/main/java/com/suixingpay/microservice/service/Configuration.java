package com.suixingpay.microservice.service;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.web.client.RestTemplate;

/**
 * Created by GZ on 2016/12/16.
 */
@org.springframework.context.annotation.Configuration
public class Configuration {


    /**
     * 启用服务发现
     */
    @EnableEurekaClient
    /**
     * 启用feign客户端
     */
//    @EnableFeignClients
    private class MyConfig{

    }

    /**
     * 带负载均衡的RestTemplate
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate loadBalanced(){
        return new RestTemplate();
    }
}
