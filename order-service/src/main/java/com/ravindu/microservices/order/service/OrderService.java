package com.ravindu.microservices.order.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.ravindu.microservices.order.dto.OrderRequest;
import com.ravindu.microservices.order.model.Order;
import com.ravindu.microservices.order.repository.OrderRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public void placeOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        order.setPrice(orderRequest.price());
        order.setSkuCode(orderRequest.skuCode());
        order.setQuantity(orderRequest.quantity());
        orderRepository.save(order);

    }

}
