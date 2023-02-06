package com.nanaseme.funmessage.controller;

import com.nanaseme.funmessage.model.domain.UserInfoDomain;
import com.nanaseme.funmessage.model.request.UserInfoInsertRequest;
import com.nanaseme.funmessage.model.result.UserInfoResult;
import com.nanaseme.funmessage.model.view.ResultView;
import com.nanaseme.funmessage.service.UserLoginService;
import com.nanaseme.funmessage.util.assembler.UserInfoAssembler;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户注册登录 控制层
 *
 * @author WangZD
 * @Date 2023/2/3 14:45
 */
@RestController
@Api(tags = "用户注册登录接口")
@RequestMapping("/user-login")
public class UserLoginController {
    @Autowired
    UserLoginService userLoginService;

    @ApiOperation(value = "注册接口", notes = "")
    @RequestMapping(value = "/sign-up", method = RequestMethod.POST)
    public ResultView<UserInfoResult> insert(@RequestBody UserInfoInsertRequest userInfoInsertRequest) {
        UserInfoDomain userInfoDomain = userLoginService.insertSelective(userInfoInsertRequest);
        UserInfoResult userInfoResult = UserInfoAssembler.assembleDomain2Result(userInfoDomain);
        return new ResultView<>(userInfoResult);
    }

}
