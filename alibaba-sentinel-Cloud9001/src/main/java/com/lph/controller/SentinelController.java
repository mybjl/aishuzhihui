package com.lph.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.lph.myHandler.HandlerException;
import com.lph.service.SentinelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.alibaba.csp.sentinel.slots.block.flow.controller.WarmUpController;

/**
 * @Author lph
 **/
@RestController
@Slf4j
public class SentinelController {

    @Autowired
    private SentinelService sentinelService;

    @GetMapping("/testA")
    public String testA() {
        try {
            Thread.sleep(200);
        } catch (Exception e) {

        }

        log.info("testA " + Thread.currentThread().getName());
        return "----testA";
    }

    @GetMapping("/testB")
    public String testB() {
        log.info("testB " + Thread.currentThread().getName());
        return "----testB";
    }

    @GetMapping("/testC")
    public String testC() {
        log.info("testC " + Thread.currentThread().getName());
        return sentinelService.test() + ":testC";
    }

    @GetMapping("/testD")
    public String testD() {
        log.info("testD " + Thread.currentThread().getName());
        return sentinelService.test() + ":testD";
    }

    @GetMapping("/testE")
    public String testE() {
        int i = 1 / 0;
        log.info("testE " + Thread.currentThread().getName());
        return "----testE";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey", blockHandler = "deal_testHotKey")
    public String testHotKey(@RequestParam(value = "p1", required = false) Integer p1,
                             @RequestParam(value = "p2", required = false) Integer p2) {
        log.info("testHotKey " + Thread.currentThread().getName());
        return "----testHotKey";
    }

    public String deal_testHotKey(Integer p1, Integer p2, BlockException exception) {
        return "----deal_testHotKey";
    }

    @GetMapping("/blockHandler")
    @SentinelResource(value = "blockHandler", blockHandlerClass = HandlerException.class, blockHandler = "handlerExceptionResult")
    public String blockHandler() {
//        int i = 1/0;
        return "blockhandler";
    }

    @GetMapping("/fallBack/{id}")
    @SentinelResource(value = "fallBack", fallback = "handlerFallback", exceptionsToIgnore = NullPointerException.class)
    public String fallBack(@PathVariable("id") Integer id) {
        if (id == 1) {
            throw new NullPointerException();
        }
        return "fallBack";
    }

    public String handlerFallback() {
        return "handlerFallback";
    }


    @GetMapping("/blockWithFallBack")
    @SentinelResource(value = "blockWithFallBack", fallback = "handlerFallback", blockHandler = "deal_testHotKey")
    public String blockWithFallBack() {
        int i = 1/0;
        return "blockWithFallBack";
    }

}
