package com.nanaseme.funmessage.repository.Impl;

import com.nanaseme.funmessage.repository.Impl.Base.BaseUserLoginRepositoryImpl;
import com.nanaseme.funmessage.repository.UserLoginRepository;
import org.springframework.stereotype.Repository;

/**
 * 用户注册登录 仓储层实现
 *
 * @author WangZD
 * @Date 2023/2/6 13:35
 */
@Repository("userLoginRepository")
public class UserLoginRepositoryImpl extends BaseUserLoginRepositoryImpl implements UserLoginRepository {
}
