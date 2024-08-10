package com.aywh.b_detal_spring;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class dentalController {

    @GetMapping(path = "/hello")
    public String helloString() {
        return "hello";
    }    
}
