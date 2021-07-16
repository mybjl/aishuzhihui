package com.lph.controller;

import com.lph.service.ConsumerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author lph
 **/
@RestController
public class ConsumerController {
    @Resource
    private ConsumerService consumerService;

    @GetMapping("/cousumer")
    public String cousumer() {
        return consumerService.provider();
    }


}
