package com.estudandospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandospring.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
