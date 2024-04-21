package com.base.frame;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.base")
public class BasicFrameworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicFrameworkApplication.class, args);
    }

}
