package com.example.TimeStamping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        InsuranceService bean = context.getBean(InsuranceService.class);
//        bean.saveData();
        bean.update();
        context.close();
    }
}
