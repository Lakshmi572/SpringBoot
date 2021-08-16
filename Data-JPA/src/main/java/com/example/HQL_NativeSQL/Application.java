package com.example.HQL_NativeSQL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        CrudRepo repo = context.getBean(CrudRepo.class);

       /*  proxy class will be created
       System.out.println(repo.getClass().getName());

        EmployeeEntity emp1=new EmployeeEntity();
        emp1.setId(105);
        emp1.setName("Anjan");
        emp1.setCompany("ABC");
        emp1.setSalary(1000000L);

        repo.save(emp1);*/

        List<EmployeeEntity> empBySal = repo.findEmpBySal(400000L);
        empBySal.forEach(System.out::println);

        long count= repo.count();
        System.out.println("number of empoyees: "+count);

        long empCount=repo.findEmpCountBySal(400000L);
        System.out.println("No of emp having salary more than 4 lakhs : "+empCount);

        List<EmployeeEntity> userLike = repo.findUserLike("i");
        System.out.println("Whose names end with i");
        userLike.forEach(System.out::println);


        System.out.println(" ****** All users name and salary ******");
        Object[] distinctUser = repo.findDistinctUser();
        for(Object obj:distinctUser){
            Object[] obj1=(Object[]) obj;
            System.out.print(obj1[0] + "\t");
            System.out.println(obj1[1]);
        }

        List<EmployeeEntity> empHQL = repo.findEmpHQL();
        empHQL.forEach(System.out::println);

        Object[] salHQL = repo.findSalHQL();
        for(Object obj : salHQL){
            Object[] emp=(Object[]) obj;
            System.out.print(emp[0] + "\t");
            System.out.println(emp[1]);
        }


    }
}
