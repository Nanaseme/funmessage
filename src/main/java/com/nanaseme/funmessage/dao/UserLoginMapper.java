package com.nanaseme.funmessage.dao;

import com.nanaseme.funmessage.model.data.UserInfoDO;
import org.springframework.stereotype.Component;

/**
 * 用户注册 登录 mapper层
 *
 * @author WangZD
 * @Date 2023/2/6 13:20
 */
@Component
public interface UserLoginMapper {

    /**
     * 新增数据
     *
     * @param userInfoDO 用户信息DO
     * @return 影响条数
     * @author WangZD
     * @Date 2023/2/6 13:20
     */
    Integer insertSelective(UserInfoDO userInfoDO);
}
