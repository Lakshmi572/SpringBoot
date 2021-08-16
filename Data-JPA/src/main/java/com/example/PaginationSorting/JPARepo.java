package com.example.PaginationSorting;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface JPARepo extends JpaRepository<books, Serializable> {


}
