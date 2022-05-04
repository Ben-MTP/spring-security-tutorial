package com.jindo.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ManhKM on 5/4/2022
 * @project spring-security-2-jpa-hibernate
 */
@Controller
public class WebController {

    @GetMapping(value = {"/", "/home"})
    public String homepage(){

        return "home";
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
