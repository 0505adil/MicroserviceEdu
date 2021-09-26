package com.example.finance.service;


import com.example.finance.model.Order;

import java.util.List;
import java.util.Optional;

public interface iOrderService {

    void createOrder(Order order);
    void deleteOrder(Integer id);
    List<Order> allOrders();
    Optional<Order> orderById(Integer id);
}
