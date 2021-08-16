package com.example.CompositePK;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface AccRepo extends JpaRepository<AccountEntity, Serializable> {
}
