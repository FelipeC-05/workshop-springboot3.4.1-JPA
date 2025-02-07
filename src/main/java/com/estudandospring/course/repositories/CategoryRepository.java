package com.estudandospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandospring.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{

}
