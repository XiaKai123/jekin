package com.example.jekin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JekinApplication {

    public static void main(String[] args) {
        SpringApplication.run(JekinApplication.class, args);
    }
    @RequestMapping("/index")
    public String test() {
        return "success11";
    }

}
