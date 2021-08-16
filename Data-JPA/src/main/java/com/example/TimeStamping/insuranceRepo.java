package com.example.TimeStamping;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.io.Serializable;

public interface insuranceRepo extends JpaRepository<Insurance_Plan, Serializable> {

    @Modifying
    @Transactional
    @Query(value = "update insurance_plan set plan_name=:name where id=:id",nativeQuery = true)
    public void update(Integer id,String name);
}
