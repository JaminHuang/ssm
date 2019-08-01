package com.model;

import java.util.Date;

/**
 * 团契信息类
 * JaminHuang   2019年6月19日 13:36:43
 */
public class Church {

    /**
     * 团契标识
     */
    private String ChurchId;
    /**
     * 团契名称
     */
    private String ChurchName;
    /**
     * Logo地址
     */
    private String Logo;
    /**
     * 最后更新时间
     */
    private Date UpdateTime;

    public Church() {}

    public Church(String churchId, String ChurchName, String logo) {
        this.ChurchId = churchId;
        this.ChurchName = ChurchName;
        this.Logo = logo;
        this.UpdateTime = new Date();
    }

    public String getChurchId() {
        return ChurchId;
    }

    public void setChurchId(String churchId) {
        ChurchId = churchId;
    }

    public String getChurchName() {
        return ChurchName;
    }

    public void setChurchName(String churChName) {
        ChurchName = churChName;
    }

    public String getLogo() {
        return Logo;
    }

    public void setLogo(String logo) {
        Logo = logo;
    }

    public Date getUpdateTime() {
        return UpdateTime;
    }

    public void setUpdateTime(Date updateTime) {
        UpdateTime = updateTime;
    }
}