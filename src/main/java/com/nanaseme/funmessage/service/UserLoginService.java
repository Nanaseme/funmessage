package com.nanaseme.funmessage.service;

import com.nanaseme.funmessage.model.domain.UserInfoDomain;
import com.nanaseme.funmessage.model.request.UserInfoInsertRequest;

/**
 * 用户注册登录 服务层
 *
 * @author WangZD
 * @Date 2023/2/3 14:59
 */
public interface UserLoginService {
    /**
     * 用户注册
     *
     * @return 注册结果
     * @author WangZD
     * @Date 2023/2/3 15:18
     */
    boolean userSignUp();

    //------------------------------------------------------------

    /**
     * 新增一条用户信息
     *
     * @param userInfoInsertRequest 用户新增请求
     * @return 用户信息Domain
     * @author WangZD
     * @Date 2023/2/3 17:13
     */
    UserInfoDomain insertSelective(UserInfoInsertRequest userInfoInsertRequest);
}
