package com.nanaseme.funmessage.service.impl;

import com.nanaseme.funmessage.service.UserLoginService;
import com.nanaseme.funmessage.service.impl.Base.BaseUserLoginServiceImpl;
import org.springframework.stereotype.Service;

@Service("userLoginServiceImpl")
public class UserLoginServiceImpl extends BaseUserLoginServiceImpl implements UserLoginService {
    @Override
    public boolean userSignUp() {
        return false;
    }


}
