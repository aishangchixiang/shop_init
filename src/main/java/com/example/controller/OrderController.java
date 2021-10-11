package com.example.controller;

import com.example.entity.Goods;
import com.example.entity.OrderDetails;
import com.example.service.GoodsService;
import com.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;
    @Autowired
    GoodsService goodsService;

    //去往相应的addorderdetails页面
    @RequestMapping("/toaddorderdetails")
    public ModelAndView toorderdetails(Integer goodsid,ModelMap map){
        Goods goods=goodsService.selectGoodsDetailsById(goodsid);
        map.put("goods",goods);
        return new ModelAndView("addorderdetails");
    }
    //填写新增orderdetails内容
    @RequestMapping("/addorderdetails")
    public ModelAndView getorderdetails(OrderDetails orderDetails){
        orderService.addOrderDetails(orderDetails);
        return new ModelAndView("toorderlist");
    }
    //去orderdetailslist页面
    @RequestMapping("/toorderdetailslist")
    public ModelAndView toorderlist(){
        return new ModelAndView("getorderlist");
    }
    //获取orderdetailslist，购物车里的订单列表
//    @RequestMapping("/getorderdetailslist")
//    public List<OrderDetails> getorderlist(){
//        List<OrderDetails> list=orderService.getOrderDetailsList();
//        return list;
//    }



}
