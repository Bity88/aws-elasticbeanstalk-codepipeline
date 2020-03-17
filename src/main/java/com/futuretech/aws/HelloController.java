package com.futuretech.aws;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping

    public String getMessage(){
        return "Hello Im learning CICD in AWS. I am actually Sandeep. Thank you";
    }
}
