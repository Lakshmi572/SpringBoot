package com.example.DataJPA;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
import java.util.List;

public interface JPARepo extends CrudRepository<UserEntity, Serializable> {

    //findByXXX methods
    UserEntity findByName(String name);

    List<UserEntity> findByAge(Integer age);

    UserEntity findByEmail(String mail);

    List<UserEntity> findByAgeGreaterThan(Integer i);

    List<UserEntity> findByAgeAndName(Integer i, String name);

    List<UserEntity> findByAgeOrName(Integer i, String name);


    List<UserEntity> findByAgeGreaterThanEqual(Integer i);

}
