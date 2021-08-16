package com.example.TransactionRollback.Entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address")
@Data
public class AddressEntity {

    @Id
    @Column(name="address_id")
    private Integer addId;

    @Column(name="country")
    private String country;

    @Column(name="order_id")
    private Integer orderId;
}
