package com.nanaseme.funmessage.common;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 转换器 基类
 *
 * @author WangZD
 */
public abstract class BaseConverter {

    /**
     * 转换操作者信息 for DO
     *
     * @param baseOperatorDomain
     * @param baseOperatorDO
     */
    protected static void convertOperateInfo4DO(BaseOperatorDomain baseOperatorDomain, BaseOperatorDO baseOperatorDO) {
        baseOperatorDO.setGmtCreate(baseOperatorDomain.getGmtCreate());
        baseOperatorDO.setUidCreate(baseOperatorDomain.getUidCreate());
        baseOperatorDO.setUnameCreate(baseOperatorDomain.getUnameCreate());

        baseOperatorDO.setGmtModify(baseOperatorDomain.getGmtModify());
        baseOperatorDO.setUidModify(baseOperatorDomain.getUidModify());
        baseOperatorDO.setUnameModify(baseOperatorDomain.getUnameModify());
    }

    /**
     * 转换操作者信息 for 领域模型
     *
     * @param baseOperatorDO
     * @param baseOperatorDomain
     */
    protected static void convertOperateInfo4Domain(BaseOperatorDO baseOperatorDO, BaseOperatorDomain baseOperatorDomain) {
        baseOperatorDomain.setGmtCreate(baseOperatorDO.getGmtCreate());
        baseOperatorDomain.setUidCreate(baseOperatorDO.getUidCreate());
        baseOperatorDomain.setUnameCreate(baseOperatorDO.getUnameCreate());

        baseOperatorDomain.setGmtModify(baseOperatorDO.getGmtModify());
        baseOperatorDomain.setUidModify(baseOperatorDO.getUidModify());
        baseOperatorDomain.setUnameModify(baseOperatorDO.getUnameModify());
    }

    /**
     * 将DO列表转为Domain列表
     *
     * @param doList DO列表
     * @param mapper 将DO转为Domain的方法
     * @param <T>    DO类
     * @param <R>    Domain类
     * @return Domain列表
     */
    protected static <T extends BaseDO, R extends BaseDomain> List<R> convertDOList2DomainList(List<T> doList, Function<? super T, ? extends R> mapper) {
        return doList != null ? doList.stream().map(mapper).collect(Collectors.toList()) : null;
    }

    /**
     * 将Domain列表转为DO列表
     *
     * @param domainList Domain列表
     * @param mapper     将Domain转为DO的方法
     * @param <T>        Domain类
     * @param <R>        DO类
     * @return DO列表
     */
    protected static <T extends BaseDomain, R extends BaseDO> List<R> convertDomainList2DOList(List<T> domainList, Function<? super T, ? extends R> mapper) {
        return domainList != null ? domainList.stream().map(mapper).collect(Collectors.toList()) : null;
    }

}