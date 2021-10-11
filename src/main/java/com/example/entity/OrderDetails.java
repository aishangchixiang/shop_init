package com.example.entity;

public class OrderDetails {
    private Integer orderdetailsid;
    private Integer orderid;
    private Integer goodsid;
    private String orderdetailsname;
    private String orderdetailssize;
    private String orderdetailscolor;
    private Float orderdetailsprice;
    private Integer orderdetailsnumber;
    private String orderdetailsimage;
    private GoodsOrder goodsorder;
    private Goods goods;

    public Integer getOrderdetailsid() {
        return orderdetailsid;
    }

    public void setOrderdetailsid(Integer orderdetailsid) {
        this.orderdetailsid = orderdetailsid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getOrderdetailsname() {
        return orderdetailsname;
    }

    public void setOrderdetailsname(String orderdetailsname) {
        this.orderdetailsname = orderdetailsname;
    }

    public String getOrderdetailssize() {
        return orderdetailssize;
    }

    public void setOrderdetailssize(String orderdetailssize) {
        this.orderdetailssize = orderdetailssize;
    }

    public String getOrderdetailscolor() {
        return orderdetailscolor;
    }

    public void setOrderdetailscolor(String orderdetailscolor) {
        this.orderdetailscolor = orderdetailscolor;
    }

    public Float getOrderdetailsprice() {
        return orderdetailsprice;
    }

    public void setOrderdetailsprice(Float orderdetailsprice) {
        this.orderdetailsprice = orderdetailsprice;
    }

    public Integer getOrderdetailsnumber() {
        return orderdetailsnumber;
    }

    public void setOrderdetailsnumber(Integer orderdetailsnumber) {
        this.orderdetailsnumber = orderdetailsnumber;
    }

    public String getOrderdetailsimage() {
        return orderdetailsimage;
    }

    public void setOrderdetailsimage(String orderdetailsimage) {
        this.orderdetailsimage = orderdetailsimage;
    }

    public GoodsOrder getGoodsorder() {
        return goodsorder;
    }

    public void setGoodsorder(GoodsOrder goodsorder) {
        this.goodsorder = goodsorder;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }
}
