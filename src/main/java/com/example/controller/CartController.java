package com.example.controller;

import com.example.entity.Cart;
import com.example.entity.User;
import com.example.service.CartService;
import com.example.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    CartService cartService;

    //商品添加购物车
    @RequestMapping("/addcartitem")
    public ModelAndView addcartitem(Integer goodsid,
                                    @RequestParam(value = "quantity", required = false, defaultValue = "1") Integer quantity,
                                    HttpSession session){
        User user=(User)session.getAttribute("user");
        //检查商品是否已经在购物车里，若已添加则直接加数量
        if(cartService.getcartlistbygoodsid(user.getUserid(),goodsid)!=null){
            Cart cart=cartService.getcartlistbygoodsid(user.getUserid(),goodsid);
            quantity=cart.getQuantity()+quantity;
            cartService.updatequantitybygoodsid(user.getUserid(),goodsid,quantity);
        }
        else {
            cartService.addcartitem(goodsid,quantity,user.getUserid());
        }
        return new ModelAndView("successaddcart");
    }


    //去购物车页面
    @RequestMapping("/tocartlist")
    public ModelAndView tocartlist(){
        return new ModelAndView("cartlist");
    }
    //获取购物车信息
    @RequestMapping("/getcartlist")
    public List<Cart> getcartlistbyuser(HttpSession session){
        User user=(User)session.getAttribute("user");
        List<Cart> list=cartService.getcartlist(user.getUserid());
        return list;
    }


    //减少购物车商品数量
    @RequestMapping("/subquantity")
    public ModelAndView subquantity(Integer cartid){
        Cart cart=cartService.getcartbyid(cartid);
        Integer quantity=cart.getQuantity()-1;
        if(quantity==0){
            cartService.deletecartbyid(cartid);
        }
        else {
            cartService.updatequantity(cartid,quantity);
        }
        return new ModelAndView("cartlist");
    }
    //增加购物车商品数量
    @RequestMapping("/addquantity")
    public ModelAndView addquantity(Integer cartid){
        Cart cart=cartService.getcartbyid(cartid);
        Integer quantity=cart.getQuantity()+1;
        cartService.updatequantity(cartid,quantity);
        return new ModelAndView("cartlist");
    }

}
