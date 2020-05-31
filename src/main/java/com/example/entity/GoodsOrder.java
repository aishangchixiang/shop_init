package com.example.entity;

import java.util.Date;

public class GoodsOrder {
    private Integer order_id;
    private Integer user_id;
    private String order_number;
    private Integer order_status;
    private String order_address;
    private Float order_fee;
    private Date order_date;
    private String order_express_number;
    private String order_express_name;
    private User user = new User();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }

    public Integer getOrder_status() {
        return order_status;
    }

    public void setOrder_status(Integer order_status) {
        this.order_status = order_status;
    }

    public String getOrder_address() {
        return order_address;
    }

    public void setOrder_address(String order_address) {
        this.order_address = order_address;
    }

    public Float getOrder_fee() {
        return order_fee;
    }

    public void setOrder_fee(Float order_fee) {
        this.order_fee = order_fee;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public String getOrder_express_number() {
        return order_express_number;
    }

    public void setOrder_express_number(String order_express_number) {
        this.order_express_number = order_express_number;
    }

    public String getOrder_express_name() {
        return order_express_name;
    }

    public void setOrder_express_name(String order_express_name) {
        this.order_express_name = order_express_name;
    }
}
