package com.example.sequenceGenerator;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface repo extends JpaRepository<Login, Serializable> {
}
