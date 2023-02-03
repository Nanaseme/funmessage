package com.nanaseme.funmessage.repository;

import com.nanaseme.funmessage.model.domain.UserInfoDomain;

/**
 * 用户注册登录 仓储层
 *
 * @author WangZD
 * @Date 2023/2/3 18:47
 */
public interface UserLoginRepository {

    /**
     * 新增一条用户信息
     *
     * @param userInfoDomain 用户信息Domain
     * @return 影响条数
     * @author WangZD
     * @Date 2023/2/3 18:55
     */
    Integer insertSelective(UserInfoDomain userInfoDomain);
}
