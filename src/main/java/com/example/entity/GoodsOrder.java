package com.example.entity;

import java.util.Date;

public class GoodsOrder {
    private Integer orderid;
    private Integer userid;
    private String ordernumber;
    private Integer orderstatus;
    private String orderaddress;
    private Float orderfee;
    private Date orderdate;
    private String orderexpressnumber;
    private String orderexpressname;
    private User user;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }

    public Integer getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(Integer orderstatus) {
        this.orderstatus = orderstatus;
    }

    public String getOrderaddress() {
        return orderaddress;
    }

    public void setOrderaddress(String orderaddress) {
        this.orderaddress = orderaddress;
    }

    public Float getOrderfee() {
        return orderfee;
    }

    public void setOrderfee(Float orderfee) {
        this.orderfee = orderfee;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public String getOrderexpressnumber() {
        return orderexpressnumber;
    }

    public void setOrderexpressnumber(String orderexpressnumber) {
        this.orderexpressnumber = orderexpressnumber;
    }

    public String getOrderexpressname() {
        return orderexpressname;
    }

    public void setOrderexpressname(String orderexpressname) {
        this.orderexpressname = orderexpressname;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
