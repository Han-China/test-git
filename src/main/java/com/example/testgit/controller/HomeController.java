package com.example.testgit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administratoron 2018/12/31
 **/
@RestController
public class HomeController {

    @RequestMapping(value = {"/", "/hello"})
    public String hello() {

        return "Hello World!";
    }
}
