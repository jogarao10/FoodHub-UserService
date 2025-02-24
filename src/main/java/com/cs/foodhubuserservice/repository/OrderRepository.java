package com.cs.foodhubuserservice.repository;

import com.cs.foodhubuserservice.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Orders, Integer> {
}
