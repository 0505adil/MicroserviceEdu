package com.example.finance.service.impl;

import com.example.finance.model.Order;
import com.example.finance.repository.OrderRepository;
import com.example.finance.service.iOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService  implements iOrderService {

    @Autowired
    OrderRepository orderRepository;

    @Override
    public void createOrder(Order order) {
        orderRepository.save(order);
    }

    @Override
    public void deleteOrder(Integer id) {
        orderRepository.deleteById(id);
    }

    @Override
    public List<Order> allOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Optional<Order> orderById(Integer id) {
        return orderRepository.findById(id);
    }
}
