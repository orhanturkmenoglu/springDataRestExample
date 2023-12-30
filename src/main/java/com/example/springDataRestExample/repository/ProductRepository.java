package com.example.springDataRestExample.repository;

import com.example.springDataRestExample.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByName(@Param("name") String name);

    List<Product> findAllByPriceBetween(@Param("minPrice") long minPrice, @Param("maxPrice") long maxPrice);
}