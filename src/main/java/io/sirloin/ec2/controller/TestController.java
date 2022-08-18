package io.sirloin.ec2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/ec2")
    public String ec2Test(){

        return "ec2-hook";
    }
}
