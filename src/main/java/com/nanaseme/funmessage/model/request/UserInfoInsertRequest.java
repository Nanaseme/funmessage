package com.nanaseme.funmessage.model.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 用户信息 insertRequest
 *
 * @author WangZD
 * @Date 2023/2/3 17:01
 */
public class UserInfoInsertRequest {
    /**
     * 用户账号
     */
    @NotBlank(message = "用户账号不能为空!")
    private String userAccount;
    /**
     * 用户密码
     */
    @NotBlank(message = "用户密码不能为空!")
    private String userPassword;
    /**
     * 用户邮箱
     */
    @NotBlank(message = "用户邮箱不能为空!")
    private String userMail;
    /**
     * 用户姓名
     */
    @NotBlank(message = "用户姓名不能为空!")
    private String userName;
    /**
     * 生日日期
     */
    @NotNull(message = "生日日期不能为空!")
    private Date gmtBirthday;

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
}
