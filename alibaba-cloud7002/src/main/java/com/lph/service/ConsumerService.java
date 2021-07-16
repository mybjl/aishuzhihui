package com.lph.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author lph
 **/
@FeignClient(value = "nacos-provider7001", fallback = ConsumerFallBackService.class)
public interface ConsumerService {

    @GetMapping("/provider")
    String provider();
}
