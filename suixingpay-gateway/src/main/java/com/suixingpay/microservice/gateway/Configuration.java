package com.suixingpay.microservice.gateway;


import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by GZ on 2016/12/16.
 */
@org.springframework.context.annotation.Configuration
public class Configuration {

    /**
     * 启用代理
     *
     */

    @EnableZuulProxy
    @EnableDiscoveryClient
    private class MyConfig{

    }
}
