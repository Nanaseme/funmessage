package com.nanaseme.funmessage.common;

import java.util.Date;

/**
 * 带操作信息的 返回结果 基类
 *
 * @author WangZD
 */
public abstract class BaseOperatorResult extends BaseResult {

    /**
     * 创建时间
     */
    protected Date gmtCreate;
    /**
     * 创建者ID
     */
    protected Long uidCreate;
    /**
     * 创建者
     */
    protected String unameCreate;
    /**
     * 修改时间
     */
    protected Date gmtModify;
    /**
     * 修改者ID
     */
    protected Long uidModify;
    /**
     * 修改者
     */
    protected String unameModify;

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Long getUidCreate() {
        return uidCreate;
    }

    public void setUidCreate(Long uidCreate) {
        this.uidCreate = uidCreate;
    }

    public String getUnameCreate() {
        return unameCreate;
    }

    public void setUnameCreate(String unameCreate) {
        this.unameCreate = unameCreate;
    }

    public Date getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    public Long getUidModify() {
        return uidModify;
    }

    public void setUidModify(Long uidModify) {
        this.uidModify = uidModify;
    }

    public String getUnameModify() {
        return unameModify;
    }

    public void setUnameModify(String unameModify) {
        this.unameModify = unameModify;
    }

}