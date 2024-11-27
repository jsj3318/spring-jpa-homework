package com.nhnacademy.jpaday1.repository;

import com.nhnacademy.jpaday1.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    
}