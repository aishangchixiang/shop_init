package com.example.service;


import com.example.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface GoodsService {
    @Autowired
    List<Goods> selectGoodsByCategory(Integer categoryid);
    Goods selectGoodsDetailsById(Integer categoryid);
    Integer getgoodscount(Integer categoryid);
}
