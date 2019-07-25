package com.aaa.houseManager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.aaa.houseManager.dao")
public class HouseManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HouseManagerApplication.class, args);
    }

}
