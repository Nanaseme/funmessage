package com.nanaseme.funmessage.util.converter;

import com.nanaseme.funmessage.common.BaseConverter;
import com.nanaseme.funmessage.model.data.UserInfoDO;
import com.nanaseme.funmessage.model.domain.UserInfoDomain;
import com.nanaseme.funmessage.model.enums.RecordStatusEnum;

import java.util.List;

/**
 * 用户信息 转换器
 *
 * @author WangZD
 * @Date 2023/2/6 10:27
 */
public class UserInfoConverter extends BaseConverter {

    /**
     * DO -> Domain
     *
     * @param userInfoDO DO对象
     * @return Domain对象
     * @author WangZD
     * @Date 2023/2/6 10:39
     */
    public static UserInfoDomain convertDO2Domain(UserInfoDO userInfoDO) {
        if (userInfoDO == null) {
            return null;
        }

        UserInfoDomain userInfoDomain = new UserInfoDomain();

        // 操作者信息
        convertOperateInfo4Domain(userInfoDO, userInfoDomain);

        userInfoDomain.setUserId(userInfoDO.getUserId());
        userInfoDomain.setUserAccount(userInfoDO.getUserAccount());
        userInfoDomain.setUserPassword(userInfoDO.getUserPassword());
        userInfoDomain.setUserName(userInfoDO.getUserName());
        userInfoDomain.setUserMail(userInfoDO.getUserMail());
        userInfoDomain.setGmtBirthday(userInfoDO.getGmtBirthday());
        userInfoDomain.setPermissionLevel(userInfoDO.getPermissionLevel());
        userInfoDomain.setRecordStatus(RecordStatusEnum.getByCode(userInfoDO.getRecordStatus()));
        return userInfoDomain;
    }

    /**
     * Domain -> DO
     *
     * @param userInfoDomain Domain对象
     * @return userInfoDO
     * @author WangZD
     * @Date 2023/2/6 10:39
     */
    public static UserInfoDO convertDomain2DO(UserInfoDomain userInfoDomain) {
        if (userInfoDomain == null) {
            return null;
        }

        UserInfoDO userInfoDO = new UserInfoDO();

        // 操作者信息
        convertOperateInfo4DO(userInfoDomain, userInfoDO);

        userInfoDO.setUserId(userInfoDomain.getUserId());
        userInfoDO.setUserAccount(userInfoDomain.getUserAccount());
        userInfoDO.setUserPassword(userInfoDomain.getUserPassword());
        userInfoDO.setUserName(userInfoDomain.getUserName());
        userInfoDO.setUserMail(userInfoDomain.getUserMail());
        userInfoDO.setGmtBirthday(userInfoDomain.getGmtBirthday());
        userInfoDO.setPermissionLevel(userInfoDomain.getPermissionLevel());
        userInfoDO.setRecordStatus(userInfoDomain.getRecordStatus().getCode());
        return userInfoDO;
    }

    /**
     * DOList -> DomainList
     *
     * @param userInfoDOList DO列表
     * @return DomainList
     * @author WangZD
     * @Date 2023/2/6 10:59
     */
    public static List<UserInfoDomain> convertDOList2DomainList(List<UserInfoDO> userInfoDOList) {
        return convertDOList2DomainList(userInfoDOList, UserInfoConverter::convertDO2Domain);
    }

    /**
     * DomainList -> DOList
     *
     * @param userInfoDomainList Domain列表
     * @return DOList
     * @author WangZD
     * @Date 2023/2/6 10:59
     */
    public static List<UserInfoDO> convertDomainList2DOList(List<UserInfoDomain> userInfoDomainList) {
        return convertDomainList2DOList(userInfoDomainList, UserInfoConverter::convertDomain2DO);
    }

}
