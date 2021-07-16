package com.lph.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * @Author lph
 **/
@Service
public class SentinelService {
    @SentinelResource("test")
    public String test(){
        return "test";
    }
}
