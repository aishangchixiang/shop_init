package com.example.entity;

public class GoodsImages {
    private Integer goodsimageid;
    private Integer goodsid;
    private String imageaddress;
    private Goods goods;

    public Integer getGoodsimageid() {
        return goodsimageid;
    }

    public void setGoodsimageid(Integer goodsimageid) {
        this.goodsimageid = goodsimageid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getImageaddress() {
        return imageaddress;
    }

    public void setImageaddress(String imageaddress) {
        this.imageaddress = imageaddress;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }
}
