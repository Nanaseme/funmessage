package com.nanaseme.funmessage.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "测试数据接口")
@RequestMapping("/web-test")
public class WebTest {

    @ApiOperation(value = "测试接口", notes = "")
    @RequestMapping(value = "/web-demo", method = RequestMethod.GET)
    public String webTest() {
        return "success";
    }

}
