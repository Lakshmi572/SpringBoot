package com.example.DataJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class DataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DataJpaApplication.class, args);

		JPARepo repo=context.getBean(JPARepo.class);

		// To save single record into database
		//Ctrl+Shift+/  --> to comment multiple lines
        /* UserEntity entity=new UserEntity();
		entity.setAge(23);
		entity.setId(1572);
		entity.setEmail("lakshmi123456@gmail.com");
		entity.setName("Lakshmi");

		repo.save(entity);*/

		// To insert multiple records to database at a time

/*		UserEntity entity1=new UserEntity();
		entity1.setId(1554);
		entity1.setName("Vinitha");
		entity1.setAge(23);
		entity1.setEmail("Vini@gmail.com");

		UserEntity entity2=new UserEntity();
		entity2.setId(1363);
		entity2.setName("Gayatri");
		entity2.setAge(23);
		entity2.setEmail("Polisetti@gmail.com");

		UserEntity entity3=new UserEntity();
		entity3.setId(1568);
		entity3.setName("Jaya");
		entity3.setAge(23);
		entity3.setEmail("Bonda@gmail.com");

		List<UserEntity> list=new ArrayList<UserEntity>();
		list.add(entity1);
		list.add(entity2);
		list.add(entity3);

		repo.saveAll(list);*/

		// To update Name field using save() method only
		UserEntity entity1=new UserEntity();
		entity1.setId(1613);
		entity1.setName("Angelina");
		entity1.setAge(30);
		entity1.setEmail("kothi@gmail.com");

		repo.save(entity1);


		//To retrieve a record using findById() method
		Optional<UserEntity> user=repo.findById(1477);
		System.out.println(user);

		//To retrieve few records using findByIds() method
		//1. Why do we need to take generic type as Serializable for list
		//2. Optional vs Iterable   in retrieving multiple records
		List<Serializable> l= Arrays.asList(1572,1613);
		Iterable<UserEntity> frnds=repo.findAllById(l);
		//forEach() is introduced in java 8
		frnds.forEach(System.out::println);

		// retrieving all records from database
		Iterable<UserEntity> all=repo.findAll();
		all.forEach(System.out::println);

		// count of the records present in database
		long count=repo.count();
		System.out.println("No of records :"+ count);

		//To identify whether particular record present or not
		boolean b=repo.existsById(1578);
		System.out.println("Does 1578 record exists ?? " + b);

		//Delete by id
//		repo.deleteById(1572);

		//Delete listed records
		//If Keys not present delete() method throws Id not exists
		/*List<Serializable> del=Arrays.asList(1477,1613);
		repo.deleteAllById(del);*/

		//delete all records
//		repo.deleteAll();

		//FindBy methods to retrieve records using non-primary keys
		//retrieve record if name=Prasad
		System.out.println("If name= Prasad record");
		UserEntity age=repo.findByName("Prasad");
		System.out.println(age);

		//retrieve record based on age
		System.out.println("records where age=23");
		List<UserEntity> age1=repo.findByAge(23);
		System.out.println(age1);

		//retrieve records if email=gnaga@gmail.com
		System.out.println("records where gmail=gnaga@gmail.com");
		UserEntity entity=repo.findByEmail("gnaga@gmail.com");
		System.out.println(entity);

		//find records where age greater than 21
		System.out.println("Records having age greater than 21 ");
		List<UserEntity> entities=repo.findByAgeGreaterThan(21);
		entities.forEach(System.out::println);

		//find records where age greater than or equal to 21
		System.out.println("Records having age greater than 21 age ");
		List<UserEntity> entity21=repo.findByAgeGreaterThanEqual(21);
		entity21.forEach(System.out::println);

		List<UserEntity> list1=repo.findByAgeAndName(23,"Gayatri");
		System.out.println(list1);

		List<UserEntity> list2=repo.findByAgeOrName(23,"Anny");
		System.out.println(list2);
	}

}
