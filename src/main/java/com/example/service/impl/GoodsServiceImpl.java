package com.example.service.impl;

import com.example.entity.Goods;
import com.example.mapper.GoodsMapper;
import com.example.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    GoodsMapper goodsMapper;

    public List<Goods> selectGoodsByCategory(Integer categoryid) {
        return goodsMapper.selectGoodsByCategory(categoryid);
    }

    @Override
    public Goods selectGoodsDetailsById(Integer goodsid) {
        return goodsMapper.selectGoodsDetailsById(goodsid);
    }

    @Override
    public Integer getgoodscount(Integer categoryid) {
        return goodsMapper.getgoodscount(categoryid);
    }
}
