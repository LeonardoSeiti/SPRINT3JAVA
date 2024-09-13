package com.emi.sprint1java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class EmiApplication {

    public static void main(String[] args) {

        SpringApplication.run(EmiApplication.class, args);
    }

}
