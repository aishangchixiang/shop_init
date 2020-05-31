package com.example.entity;

import javax.xml.soap.Text;
import java.util.Date;

public class Goods {
    private Integer goods_id;
    private  Integer category_id;
    private String goods_name;
    private String goods_description;
    private Float goods_original_price;
    private Float goods_discount_price;
    private Integer goods_inventory_volum;
    private String goods_origin;
    private String goods_material;
    private Float goods_freight;
    private Date goods_listingdate;
    private Integer goods_sales_volume;
    private String goods_image;
    private Category category=new Category();

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public String getGoods_description() {
        return goods_description;
    }

    public void setGoods_description(String goods_description) {
        this.goods_description = goods_description;
    }

    public Float getGoods_original_price() {
        return goods_original_price;
    }

    public void setGoods_original_price(Float goods_original_price) {
        this.goods_original_price = goods_original_price;
    }

    public Float getGoods_discount_price() {
        return goods_discount_price;
    }

    public void setGoods_discount_price(Float goods_discount_price) {
        this.goods_discount_price = goods_discount_price;
    }

    public Integer getGoods_inventory_volum() {
        return goods_inventory_volum;
    }

    public void setGoods_inventory_volum(Integer goods_inventory_volum) {
        this.goods_inventory_volum = goods_inventory_volum;
    }

    public String getGoods_origin() {
        return goods_origin;
    }

    public void setGoods_origin(String goods_origin) {
        this.goods_origin = goods_origin;
    }

    public String getGoods_material() {
        return goods_material;
    }

    public void setGoods_material(String goods_material) {
        this.goods_material = goods_material;
    }

    public Float getGoods_freight() {
        return goods_freight;
    }

    public void setGoods_freight(Float goods_freight) {
        this.goods_freight = goods_freight;
    }

    public Date getGoods_listingdate() {
        return goods_listingdate;
    }

    public void setGoods_listingdate(Date goods_listingdate) {
        this.goods_listingdate = goods_listingdate;
    }

    public Integer getGoods_sales_volume() {
        return goods_sales_volume;
    }

    public void setGoods_sales_volume(Integer goods_sales_volume) {
        this.goods_sales_volume = goods_sales_volume;
    }

    public String getGoods_image() {
        return goods_image;
    }

    public void setGoods_image(String goods_image) {
        this.goods_image = goods_image;
    }
}
