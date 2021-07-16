package com.lph;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lph
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class Cloud9001 {
    public static void main(String[] args) {
        SpringApplication.run(Cloud9001.class,args);
    }


}
