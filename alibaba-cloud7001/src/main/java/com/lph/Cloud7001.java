package com.lph;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author lph
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class Cloud7001 {
    public static void main(String[] args) {
        SpringApplication.run(Cloud7001.class,args);
    }
}
