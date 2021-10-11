package com.example.service;

import com.example.entity.Cart;
import com.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface CartService {
    @Autowired
    void addcartitem(Integer goodsid, Integer count, Integer userid);
    List<Cart> getcartlist(Integer userid);
    void updatequantitybygoodsid(Integer userid, Integer goodsid,Integer quantity);
    Cart getcartlistbygoodsid(Integer userid,Integer goodsid);
    Cart getcartbyid(Integer cartid);
    void deletecartbyid(Integer cartid);
    void updatequantity(Integer cartid,Integer quantity);
}
