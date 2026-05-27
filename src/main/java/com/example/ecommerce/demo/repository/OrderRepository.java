package com.example.ecommerce.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ecommerce.demo.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

} 
