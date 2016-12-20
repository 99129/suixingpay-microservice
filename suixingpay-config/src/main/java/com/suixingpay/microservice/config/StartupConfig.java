package com.suixingpay.microservice.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by GZ on 2016/12/20.
 */
@SpringBootApplication
@EnableConfigServer
public class StartupConfig {
    public static void main(String[] args) {
        SpringApplication.run(StartupConfig.class, args);

    }
}
