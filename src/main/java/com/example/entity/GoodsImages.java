package com.example.entity;

public class GoodsImages {
    private Integer goods_image_id;
    private Integer goods_id;
    private String image_address;
    private Goods goods = new Goods();

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Integer getGoods_image_id() {
        return goods_image_id;
    }

    public void setGoods_image_id(Integer goods_image_id) {
        this.goods_image_id = goods_image_id;
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public String getImage_address() {
        return image_address;
    }

    public void setImage_address(String image_address) {
        this.image_address = image_address;
    }
}
