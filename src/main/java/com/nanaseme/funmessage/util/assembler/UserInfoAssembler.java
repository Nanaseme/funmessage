package com.nanaseme.funmessage.util.assembler;

import com.nanaseme.funmessage.constants.CommonConstants;
import com.nanaseme.funmessage.model.domain.UserInfoDomain;
import com.nanaseme.funmessage.model.enums.RecordStatusEnum;
import com.nanaseme.funmessage.model.request.UserInfoInsertRequest;
import com.nanaseme.funmessage.util.Md5Util;
import com.nanaseme.funmessage.util.TimeUtil;

public class UserInfoAssembler {
    /**
     * InsertRequest -> Domain
     *
     * @param userInfoInsertRequest 新增请求
     * @return 新增内容Domain
     * @author WangZD
     * @Date 2023/2/3 17:55
     */
    public static UserInfoDomain assembleInsertRequest2Domain(UserInfoInsertRequest userInfoInsertRequest) {
        if (userInfoInsertRequest == null) {
            return null;
        }

        UserInfoDomain userInfoDomain = new UserInfoDomain();

        userInfoDomain.setUidCreate(CommonConstants.UID_ADMIN);
        userInfoDomain.setUnameCreate(CommonConstants.NAME_ADMIN);
        userInfoDomain.setGmtCreate(TimeUtil.getNow());
        userInfoDomain.setUidModify(CommonConstants.UID_ADMIN);
        userInfoDomain.setUnameModify(CommonConstants.NAME_ADMIN);
        userInfoDomain.setGmtModify(TimeUtil.getNow());
        userInfoDomain.setUserAccount(userInfoInsertRequest.getUserAccount());
        userInfoDomain.setUserPassword(Md5Util.secondMd5(userInfoInsertRequest.getUserPassword()));
        userInfoDomain.setUserMail(userInfoInsertRequest.getUserMail());
        userInfoDomain.setUserName(userInfoInsertRequest.getUserName());
        userInfoDomain.setGmtBirthday(userInfoInsertRequest.getGmtBirthday());
        userInfoDomain.setPermissionLevel(CommonConstants.INITIAL_PERMISSION_LEVEL);
        userInfoDomain.setRecordStatus(RecordStatusEnum.ON);

        return userInfoDomain;
    }
}
