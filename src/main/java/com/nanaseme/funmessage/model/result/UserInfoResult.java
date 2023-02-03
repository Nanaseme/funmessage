package com.nanaseme.funmessage.model.result;

import java.util.Date;

/**
 * 用户信息 result
 *
 * @author WangZD
 * @Date 2023/2/3 16:27
 */
public class UserInfoResult {
    /**
     * 用户ID
     */
    private Long userId;
    /**
     * 创建者ID
     */
    private Long uidCreate;
    /**
     * 创建者姓名
     */
    private String unameCreate;
    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     * 修改者ID
     */
    private Long uidModify;
    /**
     * 修改者姓名
     */
    private String unameModify;
    /**
     * 修改时间
     */
    private Date gmtModify;
    /**
     * 用户账号
     */
    private String userAccount;
    /**
     * 用户密码
     */
    private String userPassword;
    /**
     * 用户邮箱
     */
    private String userMail;
    /**
     * 用户姓名
     */
    private String userName;
    /**
     * 生日日期
     */
    private Date gmtBirthday;
    /**
     * 权限等级
     */
    private Integer permissionLevel;
    /**
     * 账户状态
     */
    private String recordStatus;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
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

    public Date getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getGmtBirthday() {
        return gmtBirthday;
    }

    public void setGmtBirthday(Date gmtBirthday) {
        this.gmtBirthday = gmtBirthday;
    }

    public Integer getPermissionLevel() {
        return permissionLevel;
    }

    public void setPermissionLevel(Integer permissionLevel) {
        this.permissionLevel = permissionLevel;
    }

    public String getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
    }

    @Override
    public String toString() {
        return "UserInfoDO{" +
                "userId=" + userId +
                ", uidCreate=" + uidCreate +
                ", unameCreate='" + unameCreate + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", uidModify=" + uidModify +
                ", unameModify='" + unameModify + '\'' +
                ", gmtModify=" + gmtModify +
                ", userAccount='" + userAccount + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userMail='" + userMail + '\'' +
                ", userName='" + userName + '\'' +
                ", gmtBirthday=" + gmtBirthday +
                ", permissionLevel=" + permissionLevel +
                ", recordStatus='" + recordStatus + '\'' +
                '}';
    }
}
