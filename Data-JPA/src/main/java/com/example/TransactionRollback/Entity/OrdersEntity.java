package com.example.TransactionRollback.Entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="orders")
@Data
public class OrdersEntity {

    @Id
    @Column(name="order_id")
    private Integer id;

    @Column(name="order_date")
    private Date orderDate;

    @Column(name="product_id")
    private Integer productId;
}
