package com.onlyme.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlyme.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
