package com.example.service.impl;

import com.example.entity.Cart;
import com.example.mapper.CartMapper;
import com.example.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    CartMapper cartMapper;

    @Override
    public void addcartitem(Integer goodsid, Integer quantity,Integer userid) {
        cartMapper.addcartitem(goodsid,quantity,userid);
    }

    @Override
    public List<Cart> getcartlist(Integer userid) {
        return cartMapper.getcartlist(userid);
    }

    @Override
    public void updatequantitybygoodsid(Integer userid ,Integer goodsid, Integer quantity) {
        cartMapper.updatequantitybygoodsid(userid,goodsid,quantity);
    }

    @Override
    public Cart getcartlistbygoodsid(Integer userid, Integer goodsid) {
        return cartMapper.getcartlistbygoodsid(userid,goodsid);
    }

    @Override
    public Cart getcartbyid(Integer cartid) {
        return cartMapper.getcartbyid(cartid);
    }

    @Override
    public void deletecartbyid(Integer cartid) {
        cartMapper.deletecartbyid(cartid);
    }

    @Override
    public void updatequantity(Integer cartid, Integer quantity) {
        cartMapper.updatequantity(cartid,quantity);
    }
}
