package com.example.CRUD_CustomQueries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.io.Serializable;

public interface JPARepo extends JpaRepository<Students, Serializable> {

    /*@Transactional
    @Modifying
     @Query(value="insert into student(marks,student_name,school) values(:marks,:student_name,:school)")
    void insert(@Param("marks") Integer marks, @Param("student_name") String student_name, @Param("school") String school);
*/

    @Modifying
    @Transactional
    @Query(value="update Student set student_name=:student_name where student_id=:student_id",nativeQuery = true)
    void update(String student_name, Integer student_id);

    @Modifying
    @Transactional
    @Query(value="insert into Student(student_id,student_name,marks) values(:student_id,:student_name,:marks)",nativeQuery = true)
    void insert(Integer student_id,String student_name,Integer marks);

    //not working
   /* @Modifying
    @Transactional
    @Query(value="insert into Student(student_name,marks) values(:student_name,:marks)",nativeQuery = true)
    void insert1(String student_name,Integer marks);*/


    @Modifying
    @Transactional
    @Query(value="delete from Student where student_id=:student_id",nativeQuery = true)
    void deleteRow(Integer student_id);
 }
