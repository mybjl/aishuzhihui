package com.lph.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lph
 **/
@RestController
public class ProviderController {

    @GetMapping("/provider")
    public String provider() {
        return "success";
    }
}
