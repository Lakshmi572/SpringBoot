package com.example.PaginationSorting;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        JPARepo repo = context.getBean(JPARepo.class);

//repo.deleteAll();
       /* books b1=new books();
        b1.setName("The Alchemist");
        b1.setPrice(560);
        repo.save(b1);

        books b2=new books();
        b2.setName("Twilight");
        b2.setPrice(1000);
        repo.save(b2);

        books b3=new books();
        b3.setName("Da Vinci");
        b3.setPrice(123);
        repo.save(b3);

        books b4=new books();
        b4.setName("Harry potter");
        b4.setPrice(2345);
        repo.save(b4);

        books b5=new books();
        b5.setName("");
        b5.setPrice(1000);
        repo.save(b5);

        books b6=new books();
        b6.setName("The Glass Palace");
        b6.setPrice(5000);
        repo.save(b6);

        books b7=new books();
        b7.setName("Geethanjali");
        b7.setPrice(400);
        repo.save(b7);

        books b8=new books();
        b8.setName("karabean Knights");
        b8.setPrice(10000);
        repo.save(b8);*/


        //Sorting
        System.out.println("******* ascending name *********");
        List<books> name = repo.findAll(Sort.by("name").ascending());
        name.forEach(System.out::println);

        System.out.println("******* descending price *********");
        List<books> price=repo.findAll(Sort.by("price").descending());
        price.forEach(System.out::println);

        // Query b Example
        System.out.println("******** Query by Example on Price  and Sorting by name ****************");
        books b=new books();
        b.setPrice(1000);
        Example<books> ex=Example.of(b);
        List<books> all = repo.findAll(ex,Sort.by("name").ascending());
        all.forEach(System.out::println);


        //Pagination
        System.out.println("************* Pagination: 1st Page of books list ***************************");
        PageRequest page=PageRequest.of(0,3);
        Page<books> booksPage = repo.findAll(page);
        booksPage.forEach(System.out::println);

        System.out.println("************* Pagination: 2nd Page of books list ***************************");
        PageRequest page1=PageRequest.of(1,3);
        Page<books> booksPage1 = repo.findAll(page1);
        booksPage1.forEach(System.out::println);
    }
}
