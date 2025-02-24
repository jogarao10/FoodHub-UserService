package com.cs.foodhubuserservice.service;

import com.cs.foodhubuserservice.entity.Orders;
import com.cs.foodhubuserservice.entity.User;

import java.util.List;
import java.util.Optional;

public interface IOrderService {
    public Orders addOrder(Orders order);
    public List<Orders> getAllOrders();
    public Optional<Orders> getOrderById(Integer orderId);

}
