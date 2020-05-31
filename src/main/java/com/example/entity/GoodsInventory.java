package com.example.entity;

public class GoodsInventory {
    private Integer inventory_id;
    private Integer goods_id;
    private Integer size_id;
    private String size_name;
    private Integer color_id;
    private String color_name;
    private Integer inventory_volume;
    private Integer sales_volume;
    private Goods goods = new Goods();
    private GoodsSize goodsSize = new GoodsSize();
    private GoodsColor goodsColor = new GoodsColor();

    public Integer getInventory_id() {
        return inventory_id;
    }

    public void setInventory_id(Integer inventory_id) {
        this.inventory_id = inventory_id;
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

    public String getSize_name() {
        return size_name;
    }

    public void setSize_name(String size_name) {
        this.size_name = size_name;
    }

    public Integer getColor_id() {
        return color_id;
    }

    public void setColor_id(Integer color_id) {
        this.color_id = color_id;
    }

    public String getColor_name() {
        return color_name;
    }

    public void setColor_name(String color_name) {
        this.color_name = color_name;
    }

    public Integer getInventory_volume() {
        return inventory_volume;
    }

    public void setInventory_volume(Integer inventory_volume) {
        this.inventory_volume = inventory_volume;
    }

    public Integer getSales_volume() {
        return sales_volume;
    }

    public void setSales_volume(Integer sales_volume) {
        this.sales_volume = sales_volume;
    }

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

    public GoodsColor getGoodsColor() {
        return goodsColor;
    }

    public void setGoodsColor(GoodsColor goodsColor) {
        this.goodsColor = goodsColor;
    }
}
