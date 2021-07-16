package com.lph;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author lph
 **/
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class Cloud7002 {
    public static void main(String[] args) {
        SpringApplication.run(Cloud7002.class, args);
    }
}
