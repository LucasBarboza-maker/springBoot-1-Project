package com.onlyme.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlyme.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
