package com.cs.foodhubuserservice.controller;


import com.cs.foodhubuserservice.entity.Orders;
import com.cs.foodhubuserservice.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private IOrderService orderService;


    @PostMapping("/save")
    public Orders addOder(@RequestBody Orders order) {

        return orderService.addOrder(order);
    }

    @GetMapping("/all")
    public List<Orders> getAllOrders() {

        return orderService.getAllOrders();
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<?> getOrderById(@PathVariable Integer orderId) {
        Optional<Orders> order = orderService.getOrderById(orderId);

        if (order.isPresent()) {
            return ResponseEntity.ok(order.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(Collections.singletonMap("message", "Order ID " + orderId + " not found"));
        }
    }



}
