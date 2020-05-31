package com.example.entity;

public class OrderDetails {
    private Integer order_details_id;
    private Integer order_id;
    private Integer goods_id;
    private String order_details_name;
    private String order_details_size;
    private String order_details_color;
    private Float order_details_price;
    private Integer order_details_number;
    private String order_details_image;
    private GoodsOrder goods_order = new GoodsOrder();
    private Goods goods = new Goods();

    public GoodsOrder getGoods_order() {
        return goods_order;
    }

    public void setGoods_order(GoodsOrder goods_order) {
        this.goods_order = goods_order;
    }

    public Goods getGoods() { return goods; }

    public void setGoods(Goods goods) { this.goods = goods; }

    public Integer getOrder_details_id() {
        return order_details_id;
    }

    public void setOrder_details_id(Integer order_details_id) {
        this.order_details_id = order_details_id;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public String getOrder_details_name() {
        return order_details_name;
    }

    public void setOrder_details_name(String order_details_name) {
        this.order_details_name = order_details_name;
    }

    public String getOrder_details_size() {
        return order_details_size;
    }

    public void setOrder_details_size(String order_details_size) {
        this.order_details_size = order_details_size;
    }

    public String getOrder_details_color() {
        return order_details_color;
    }

    public void setOrder_details_color(String order_details_color) {
        this.order_details_color = order_details_color;
    }

    public Float getOrder_details_price() {
        return order_details_price;
    }

    public void setOrder_details_price(Float order_details_price) {
        this.order_details_price = order_details_price;
    }

    public Integer getOrder_details_number() {
        return order_details_number;
    }

    public String getOrder_details_image() {
        return order_details_image;
    }

    public void setOrder_details_image(String order_details_image) {
        this.order_details_image = order_details_image;
    }

    public void setOrder_details_number(Integer order_details_number) {
        this.order_details_number = order_details_number;
    }
}
