package com.example.controller;

import com.example.entity.Goods;
import com.example.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.ModelMap;

import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    GoodsService goodsService;

    //去往相对应的goodslist页面
    @RequestMapping("/togoodslistbycategory")
    public ModelAndView toGoodsList(Integer id,@RequestParam(defaultValue = "1",value = "pagenumber")Integer pagenumber , ModelMap map){
        map.put("categoryid",id);
        map.put("pagenumber",pagenumber);
        return new ModelAndView("goodslistbycategory");
    }
    //获取相应的goodslist页面
    @ResponseBody
    @RequestMapping("/getgoodslistbycategory")
    public PageInfo<Goods> selectGoodsByCategory(Integer id,@RequestParam(defaultValue = "1",value = "pagenumber")Integer pagenumber ){
        //先做分页查询
        PageHelper.startPage(pagenumber,3);
        List<Goods> list=goodsService.selectGoodsByCategory(id);
        PageInfo<Goods> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
    //去往相goodsdetails页面
    @RequestMapping("/togoodsdetailsbyid")
    public ModelAndView toGoodsDetails(Integer id, ModelMap map){
        map.put("goodsid",id);
        return new ModelAndView("goodsdetails");
    }
    //获取相应的goodsdetails页面
    @ResponseBody
    @RequestMapping("/getgoodsdetailsbyid")
    public Goods selectGoodsById(Integer id){
        Goods goods=goodsService.selectGoodsDetailsById(id);
        return goods;
    }
}
