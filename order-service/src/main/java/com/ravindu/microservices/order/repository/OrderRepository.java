package com.ravindu.microservices.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravindu.microservices.order.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
