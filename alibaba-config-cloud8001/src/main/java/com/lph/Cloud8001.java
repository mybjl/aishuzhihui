package com.lph;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author lph
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class Cloud8001 {
    public static void main(String[] args) {
        SpringApplication.run(Cloud8001.class,args);
    }
}
