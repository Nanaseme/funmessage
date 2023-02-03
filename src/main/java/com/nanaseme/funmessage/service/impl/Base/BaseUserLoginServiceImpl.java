package com.nanaseme.funmessage.service.impl.Base;

import com.nanaseme.funmessage.common.BaseObject;
import com.nanaseme.funmessage.model.domain.UserInfoDomain;
import com.nanaseme.funmessage.model.request.UserInfoInsertRequest;
import com.nanaseme.funmessage.service.UserLoginService;
import com.nanaseme.funmessage.util.ValidateUtil;
import com.nanaseme.funmessage.util.assembler.UserInfoAssembler;

/**
 * 用户登录 服务层基础实现
 *
 * @author WangZD
 * @Date 2023/2/3 17:18
 */
public abstract class BaseUserLoginServiceImpl extends BaseObject implements UserLoginService {
    /**
     * 新增一条用户信息
     *
     * @param userInfoInsertRequest 用户新增请求
     * @return 用户信息Domain
     * @author WangZD
     * @Date 2023/2/3 17:18
     */
    @Override
    public UserInfoDomain insertSelective(UserInfoInsertRequest userInfoInsertRequest) {
        // 校验
        ValidateUtil.fastFailValidate(userInfoInsertRequest);

        UserInfoDomain userInfoDomain = UserInfoAssembler.assembleInsertRequest2Domain(userInfoInsertRequest);


        return null;
    }
}
