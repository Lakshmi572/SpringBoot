package com.example.TransactionRollback;

import com.example.TransactionRollback.Service.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class applications {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(applications.class, args);

        OrderService bean = context.getBean(OrderService.class);
        bean.saveData();

//        context.close();
    }
}
