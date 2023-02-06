package com.nanaseme.funmessage.model.domain;

import com.nanaseme.funmessage.common.BaseOperatorDomain;
import com.nanaseme.funmessage.model.enums.RecordStatusEnum;

import java.util.Date;

/**
 * 用户信息 Domain
 *
 * @author WangZD
 * @Date 2023/2/3 16:26
 */
public class UserInfoDomain extends BaseOperatorDomain {
    /**
     * 用户ID
     */
    private Long userId;
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
    private RecordStatusEnum recordStatus;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public RecordStatusEnum getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(RecordStatusEnum recordStatus) {
        this.recordStatus = recordStatus;
    }

    @Override
    public String toString() {
        return "UserInfoDomain{" +
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
                ", recordStatus=" + recordStatus +
                '}';
    }
}
