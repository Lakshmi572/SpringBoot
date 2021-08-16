package com.example.CustomGenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);

        repo repo = context.getBean(com.example.CustomGenerator.repo.class);

        Login l=new Login();
        l.setName("LakshmiG");
        l.setUname("Ganjikunta");
        l.setPwd("Lakshmi@75");

        Login save = repo.save(l);
        System.out.println(save);
    }
}
