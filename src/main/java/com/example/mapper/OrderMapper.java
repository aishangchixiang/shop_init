package com.example.mapper;

import com.example.entity.GoodsOrder;
import com.example.entity.OrderDetails;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OrderMapper {
    void addOrderDetails(OrderDetails orderDetails);
    void addOrder(GoodsOrder goodsOrder);
    List<OrderDetails> getOrderDetailsList(Integer id);
    OrderDetails getOrderDetailsById(Integer id);
}
