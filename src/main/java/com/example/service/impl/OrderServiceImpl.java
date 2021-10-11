package com.example.service.impl;

import com.example.entity.GoodsOrder;
import com.example.entity.OrderDetails;
import com.example.mapper.OrderMapper;
import com.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;

    @Override
    public void addOrderDetails(OrderDetails orderDetails) {
        orderMapper.addOrderDetails(orderDetails);
    }

    @Override
    public void addOrder(GoodsOrder goodsOrder) {
        orderMapper.addOrder(goodsOrder);
    }

    @Override
    public List<OrderDetails> getOrderDetailsList(Integer id) {
        return orderMapper.getOrderDetailsList(id);
    }

    @Override
    public OrderDetails getOrderDetailsById(Integer id) {
        return orderMapper.getOrderDetailsById(id);
    }
}
