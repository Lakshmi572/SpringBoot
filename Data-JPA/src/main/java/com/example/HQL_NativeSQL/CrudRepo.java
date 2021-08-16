package com.example.HQL_NativeSQL;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
import java.util.List;

public interface CrudRepo extends CrudRepository<EmployeeEntity, Serializable> {

    //Using Native SQL Query
    @Query(value = "select * from employee where salary >= :salary", nativeQuery = true)
    List<EmployeeEntity>  findEmpBySal(Long salary);

    @Query(value = "select count(*) from employee where salary >= :salary", nativeQuery = true)
    long  findEmpCountBySal(Long salary);

    @Query(value="select * from employee where emp_name LIKE %:like", nativeQuery = true)
    List<EmployeeEntity> findUserLike(String like);

    @Query(value="select emp_name,salary from employee", nativeQuery = true)
    Object[] findDistinctUser();


    //Using HQL Queries
    @Query("from EmployeeEntity")
    List<EmployeeEntity> findEmpHQL();

    @Query("select name,salary from EmployeeEntity")
    Object[] findSalHQL();
}
