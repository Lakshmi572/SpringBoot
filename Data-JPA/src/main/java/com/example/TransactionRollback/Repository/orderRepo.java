package com.example.TransactionRollback.Repository;

import com.example.TransactionRollback.Entity.OrdersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface orderRepo extends JpaRepository<OrdersEntity, Serializable> {
}
