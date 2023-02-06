package com.nanaseme.funmessage.model.result;

import com.nanaseme.funmessage.common.BaseOperatorResult;

import java.util.Date;

/**
 * 用户信息 result
 *
 * @author WangZD
 * @Date 2023/2/3 16:27
 */
public class UserInfoResult extends BaseOperatorResult {
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
    private String recordStatus;

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

    public String getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
    }
}
