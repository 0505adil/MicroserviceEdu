package com.example.finance.controller;

import com.example.finance.model.Order;
import com.example.finance.service.iOrderService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/finance")
@AllArgsConstructor
public class FinanceController {

    private iOrderService iOrderService;


    @PostMapping("/create")
    public void createOrder(@RequestBody Order order){
        iOrderService.createOrder(order);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteOrder(@PathVariable("id") Integer id){
        iOrderService.deleteOrder(id);
    }

    @GetMapping("/all/orders")
    public List<Order> getAllOrders(){
        return iOrderService.allOrders();
    }

    @GetMapping("/issue/order/{id}")
    public Optional<Order> getIssueOrder(@PathVariable("id") Integer id){
        return iOrderService.orderById(id);
    }
}
