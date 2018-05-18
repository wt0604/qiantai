package com.jk.pojo;


public class Shang {

    private Integer goodsid;
    private String goodsname;
    private String goodsimg;
    private String goodsimg1;
    private String goodsimg2;
    private String goodsimg3;
    private String goodsimg4;
    private String shangdate;
    private Double goodsprice;
    private Integer zhuangtai;
    private Integer chunum;
    private String goodscolor;
    private String goodsgg;
    private Integer mintypeid;
    private String goodsinfo;
    private String mintypename;

    public String getGoodsimg1() {
        return goodsimg1;
    }

    public void setGoodsimg1(String goodsimg1) {
        this.goodsimg1 = goodsimg1;
    }

    public String getGoodsimg2() {
        return goodsimg2;
    }

    public void setGoodsimg2(String goodsimg2) {
        this.goodsimg2 = goodsimg2;
    }

    public String getGoodsimg3() {
        return goodsimg3;
    }

    public void setGoodsimg3(String goodsimg3) {
        this.goodsimg3 = goodsimg3;
    }

    public String getGoodsimg4() {
        return goodsimg4;
    }

    public void setGoodsimg4(String goodsimg4) {
        this.goodsimg4 = goodsimg4;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public String getGoodsimg() {
        return goodsimg;
    }

    public void setGoodsimg(String goodsimg) {
        this.goodsimg = goodsimg;
    }

    public String getShangdate() {
        return shangdate;
    }

    public void setShangdate(String shangdate) {
        this.shangdate = shangdate;
    }

    public Double getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(Double goodsprice) {
        this.goodsprice = goodsprice;
    }

    public Integer getZhuangtai() {
        return zhuangtai;
    }

    public void setZhuangtai(Integer zhuangtai) {
        this.zhuangtai = zhuangtai;
    }

    public Integer getChunum() {
        return chunum;
    }

    public void setChunum(Integer chunum) {
        this.chunum = chunum;
    }

    public String getGoodscolor() {
        return goodscolor;
    }

    public void setGoodscolor(String goodscolor) {
        this.goodscolor = goodscolor;
    }

    public String getGoodsgg() {
        return goodsgg;
    }

    public void setGoodsgg(String goodsgg) {
        this.goodsgg = goodsgg;
    }

    public Integer getMintypeid() {
        return mintypeid;
    }

    public void setMintypeid(Integer mintypeid) {
        this.mintypeid = mintypeid;
    }

    public String getGoodsinfo() {
        return goodsinfo;
    }

    public void setGoodsinfo(String goodsinfo) {
        this.goodsinfo = goodsinfo;
    }

    public String getMintypename() {
        return mintypename;
    }

    public void setMintypename(String mintypename) {
        this.mintypename = mintypename;
    }

    @Override
    public String toString() {
        return "Shang{" +
                "goodsid=" + goodsid +
                ", goodsname='" + goodsname + '\'' +
                ", goodsimg='" + goodsimg + '\'' +
                ", shangdate='" + shangdate + '\'' +
                ", goodsprice=" + goodsprice +
                ", zhuangtai=" + zhuangtai +
                ", chunum=" + chunum +
                ", goodscolor=" + goodscolor +
                ", goodsgg=" + goodsgg +
                ", mintypeid=" + mintypeid +
                ", goodsinfo='" + goodsinfo + '\'' +
                ", mintypename='" + mintypename + '\'' +
                '}';
    }
}
