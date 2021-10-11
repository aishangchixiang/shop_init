package com.example.mapper;


import com.example.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository

public interface GoodsMapper {
    List<Goods> selectGoodsByCategory(Integer categoryid);
    Goods selectGoodsDetailsById(Integer goodsid);
    Integer getgoodscount(Integer categoryid);

}
