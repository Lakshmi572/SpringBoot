package com.example.TransactionRollback.Repository;

import com.example.TransactionRollback.Entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface addressRepo extends JpaRepository<AddressEntity, Serializable> {
}
