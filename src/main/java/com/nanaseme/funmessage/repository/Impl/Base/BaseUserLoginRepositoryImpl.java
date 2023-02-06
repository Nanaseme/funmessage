package com.nanaseme.funmessage.repository.Impl.Base;

import com.nanaseme.funmessage.common.BaseObject;
import com.nanaseme.funmessage.dao.UserLoginMapper;
import com.nanaseme.funmessage.model.data.UserInfoDO;
import com.nanaseme.funmessage.model.domain.UserInfoDomain;
import com.nanaseme.funmessage.repository.UserLoginRepository;
import com.nanaseme.funmessage.util.converter.UserInfoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;

/**
 * 用户注册登录 仓储层基础实现
 *
 * @author WangZD
 * @Date 2023/2/3 18:48
 */
public abstract class BaseUserLoginRepositoryImpl extends BaseObject implements UserLoginRepository {
    @Autowired
    UserLoginMapper userLoginMapper;

    /**
     * 新增一条用户信息
     *
     * @param userInfoDomain 用户信息Domain
     * @return 影响条数
     * @author WangZD
     * @Date 2023/2/3 18:57
     */
    @Override
    public Integer insertSelective(UserInfoDomain userInfoDomain) {
        UserInfoDO userInfoDO = UserInfoConverter.convertDomain2DO(userInfoDomain);
        try {
            return userLoginMapper.insertSelective(userInfoDO);
        } catch (DuplicateKeyException duplicateKeyException) {
            // todo 断言工具类
            throw duplicateKeyException;
        }
    }
}
