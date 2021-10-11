package com.example.entity;

import javax.xml.soap.Text;
import java.util.Date;

public class Goods {
    private Integer goodsid;
    private Integer categoryid;
    private String goodsname;
    private String goodsdescription;
    private Float goodsoriginalprice;
    private Float goodsdiscountprice;
    private Integer goodsinventoryvolum;
    private String goodsorigin;
    private String goodsmaterial;
    private Float goodsfreight;
    private Date goodslistingdate;
    private Integer goodssalesvolume;
    private String goodsimage;
    private Category category;

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public String getGoodsdescription() {
        return goodsdescription;
    }

    public void setGoodsdescription(String goodsdescription) {
        this.goodsdescription = goodsdescription;
    }

    public Float getGoodsoriginalprice() {
        return goodsoriginalprice;
    }

    public void setGoodsoriginalprice(Float goodsoriginalprice) {
        this.goodsoriginalprice = goodsoriginalprice;
    }

    public Float getGoodsdiscountprice() {
        return goodsdiscountprice;
    }

    public void setGoodsdiscountprice(Float goodsdiscountprice) {
        this.goodsdiscountprice = goodsdiscountprice;
    }

    public Integer getGoodsinventoryvolum() {
        return goodsinventoryvolum;
    }

    public void setGoodsinventoryvolum(Integer goodsinventoryvolum) {
        this.goodsinventoryvolum = goodsinventoryvolum;
    }

    public String getGoodsorigin() {
        return goodsorigin;
    }

    public void setGoodsorigin(String goodsorigin) {
        this.goodsorigin = goodsorigin;
    }

    public String getGoodsmaterial() {
        return goodsmaterial;
    }

    public void setGoodsmaterial(String goodsmaterial) {
        this.goodsmaterial = goodsmaterial;
    }

    public Float getGoodsfreight() {
        return goodsfreight;
    }

    public void setGoodsfreight(Float goodsfreight) {
        this.goodsfreight = goodsfreight;
    }

    public Date getGoodslistingdate() {
        return goodslistingdate;
    }

    public void setGoodslistingdate(Date goodslistingdate) {
        this.goodslistingdate = goodslistingdate;
    }

    public Integer getGoodssalesvolume() {
        return goodssalesvolume;
    }

    public void setGoodssalesvolume(Integer goodssalesvolume) {
        this.goodssalesvolume = goodssalesvolume;
    }

    public String getGoodsimage() {
        return goodsimage;
    }

    public void setGoodsimage(String goodsimage) {
        this.goodsimage = goodsimage;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
