package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by ln on 2022/7/13
 * file description:
 * last update by {} on {}
 * update description:
 *
 * @author ln
 */

@RestController
public class TestController {

    @GetMapping(value = "/",produces = "text/plan")
    public String get(){
        return "这是第一个";
    }



}
