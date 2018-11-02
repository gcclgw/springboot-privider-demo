package com.jk.model.adver;

import java.io.Serializable;

public class Adver implements Serializable {
    private static final long serialVersionUID = -7292932049958909364L;

    /**
     * 广告Id
     */
    private  String  adverid;

    /**
     * 广告名
     */
    private String advername;

    /**
     * 广告链接
     */
    private String adverurl;

    /**
     * 广告图片
     */
    private String adimg;

    /**
     * 广告位id
     */
    private  String  adseatid;

    public String getAdverid() {
        return adverid;
    }

    public void setAdverid(String adverid) {
        this.adverid = adverid;
    }

    public String getAdvername() {
        return advername;
    }

    public void setAdvername(String advername) {
        this.advername = advername;
    }

    public String getAdverurl() {
        return adverurl;
    }

    public void setAdverurl(String adverurl) {
        this.adverurl = adverurl;
    }

    public String getAdimg() {
        return adimg;
    }

    public void setAdimg(String adimg) {
        this.adimg = adimg;
    }

    public String getAdseatid() {
        return adseatid;
    }

    public void setAdseatid(String adseatid) {
        this.adseatid = adseatid;
    }


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
