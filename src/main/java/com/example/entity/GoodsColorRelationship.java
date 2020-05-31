package com.example.entity;

public class GoodsColorRelationship {
    private Integer goods_id;
    private Integer color_id;
    private Goods goods = new Goods();
    private GoodsColor goodsColor = new GoodsColor();

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

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public Integer getColor_id() {
        return color_id;
    }

    public void setColor_id(Integer color_id) {
        this.color_id = color_id;
    }

}
