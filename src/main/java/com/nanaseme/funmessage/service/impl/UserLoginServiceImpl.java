package com.nanaseme.funmessage.service.impl;

import com.nanaseme.funmessage.service.UserLoginService;
import com.nanaseme.funmessage.service.impl.Base.BaseUserLoginServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 用户注册登录 服务层实现
 *
 * @author WangZD
 * @Date 2023/2/6 13:38
 */
@Service("userLoginServiceImpl")
public class UserLoginServiceImpl extends BaseUserLoginServiceImpl implements UserLoginService {
    @Override
    public boolean userSignUp() {
        return false;
    }


}
