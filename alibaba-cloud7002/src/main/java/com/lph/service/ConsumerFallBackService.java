package com.lph.service;

import org.springframework.stereotype.Component;

/**
 * @Author lph
 **/
@Component
public class ConsumerFallBackService implements ConsumerService{
    @Override
    public String provider() {
        return "服务降级返回...ConsumerFallBackService";
    }
}
