package com.example.service;

import com.example.entity.GoodsOrder;
import com.example.entity.OrderDetails;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface OrderService {
    @Autowired
    void addOrderDetails(OrderDetails order);
    void addOrder(GoodsOrder goodsOrder);
    List<OrderDetails> getOrderDetailsList(Integer id);
    OrderDetails getOrderDetailsById(Integer id);
}
