package com.cslc.withRedis.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Created by jay on 2018/5/7.
 */
@RestController
public class HelloController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ResponseBody
    public String hello(@RequestParam String name){

        return "hello"+name;
    }
}
