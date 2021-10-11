package com.example.entity;

public class GoodsInventory {
    private Integer inventoryid;
    private Integer goodsid;
    private Integer sizeid;
    private String sizename;
    private Integer colorid;
    private String colorname;
    private Integer inventoryvolume;
    private Integer salesvolume;
    private Goods goods;
    private GoodsSize goodsSize;
    private GoodsColor goodsColor;

    public Integer getInventoryid() {
        return inventoryid;
    }

    public void setInventoryid(Integer inventoryid) {
        this.inventoryid = inventoryid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getSizeid() {
        return sizeid;
    }

    public void setSizeid(Integer sizeid) {
        this.sizeid = sizeid;
    }

    public String getSizename() {
        return sizename;
    }

    public void setSizename(String sizename) {
        this.sizename = sizename;
    }

    public Integer getColorid() {
        return colorid;
    }

    public void setColorid(Integer colorid) {
        this.colorid = colorid;
    }

    public String getColorname() {
        return colorname;
    }

    public void setColorname(String colorname) {
        this.colorname = colorname;
    }

    public Integer getInventoryvolume() {
        return inventoryvolume;
    }

    public void setInventoryvolume(Integer inventoryvolume) {
        this.inventoryvolume = inventoryvolume;
    }

    public Integer getSalesvolume() {
        return salesvolume;
    }

    public void setSalesvolume(Integer salesvolume) {
        this.salesvolume = salesvolume;
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
