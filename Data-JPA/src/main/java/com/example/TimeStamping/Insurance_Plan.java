package com.example.TimeStamping;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;
import java.time.LocalDate;

@Entity
@Data
public class Insurance_Plan {

    @Id
    @GeneratedValue
    private Integer id;

    private String plan_name;

    private Boolean plan_status;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDate created_date;

    @UpdateTimestamp
    @Column(insertable = false)
    private LocalDate updated_date;
}
