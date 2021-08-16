package com.example.CRUD_CustomQueries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        JPARepo repo = context.getBean(JPARepo.class);

        //Using Generator to generate value for student_id which is primary key
        //have to check: Unable to generate value by using custom queries
        /*Students s1=new Students();
        s1.setName("Teja");
        s1.setSchool("NDL");
        s1.setMarks(90);

        repo.save(s1);*/

//        repo.insert(98,"Jaya","Viz");

        //Update name where id = 2
//        repo.update("Kothi",2);

//        repo.insert(111,"Jaya",98);

        //not working
//        repo.insert1("Teja",91);

        //deleting a row based on student id
//        repo.deleteRow(111);
    }
}
