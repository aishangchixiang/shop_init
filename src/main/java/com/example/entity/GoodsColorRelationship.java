package com.example.entity;

public class GoodsColorRelationship {
    private Integer goodsid;
    private Integer colorid;
    private Goods goods;
    private GoodsColor goodsColor;

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getColorid() {
        return colorid;
    }

    public void setColorid(Integer colorid) {
        this.colorid = colorid;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public GoodsColor getGoodsColor() {
        return goodsColor;
    }

    public void setGoodsColor(GoodsColor goodsColor) {
        this.goodsColor = goodsColor;
    }
}
