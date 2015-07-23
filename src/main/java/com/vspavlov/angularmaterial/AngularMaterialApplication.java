package com.vspavlov.angularmaterial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
//@ComponentScan(basePackages = "com.vspavlov.angularmaterial.*")
public class AngularMaterialApplication {

    public static void main(String[] args) {
        SpringApplication.run(AngularMaterialApplication.class, args);
    }
}
