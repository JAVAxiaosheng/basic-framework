package com.base.frame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "com.base")
@EnableDiscoveryClient
public class BasicFrameworkApplication {
    public static void main(String[] args) {
        SpringApplication.run(BasicFrameworkApplication.class, args);
    }
}
