package com.suixingpay.microservice.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by GZ on 2016/12/20.
 */
@SpringBootApplication
@EnableEurekaServer
public class StartupEureka {

    public static void main(String[] args) {
        SpringApplication.run(StartupEureka.class, args);
    }
}
