package com.example.entity;

public class GoodsSizeRelatinship {
    private Integer goods_id;
    private Integer size_id;
    private Goods goods;
    private GoodsSize goodsSize;

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public GoodsSize getGoodsSize() {
        return goodsSize;
    }

    public void setGoodsSize(GoodsSize goodsSize) {
        this.goodsSize = goodsSize;
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public Integer getSize_id() {
        return size_id;
    }

    public void setSize_id(Integer size_id) {
        this.size_id = size_id;
    }
}
