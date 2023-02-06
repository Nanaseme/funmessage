package com.nanaseme.funmessage.common;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 组装器基类
 *
 * @author panye
 */
public abstract class BaseAssembler {

    /**
     * 组装操作者信息
     *
     * @param baseOperatorDomain
     */
    protected static void assembleOperateInfo4Domain(BaseOperatorDomain baseOperatorDomain) {
        // 创建信息
//        baseOperatorDomain.setGmtCreate(ThreadInfo.getInvokeTime());
//        baseOperatorDomain.setUidCreate(ThreadInfo.getUserId());
//        baseOperatorDomain.setUnameCreate(ThreadInfo.getUserName());

        // 修改信息
//        baseOperatorDomain.setGmtModify(ThreadInfo.getInvokeTime());
//        baseOperatorDomain.setUidModify(ThreadInfo.getUserId());
//        baseOperatorDomain.setUnameModify(ThreadInfo.getUserName());
    }

    /**
     * 组装修改者信息
     *
     * @param baseOperatorDomain
     */
    public static void assembleUpdaterInfo4Domain(BaseOperatorDomain baseOperatorDomain) {
        // 修改信息
//        baseOperatorDomain.setGmtModify(ThreadInfo.getInvokeTime());
//        baseOperatorDomain.setUidModify(ThreadInfo.getUserId());
//        baseOperatorDomain.setUnameModify(ThreadInfo.getUserName());
    }

    /**
     * 组装操作者信息
     *
     * @param baseOperatorDomain
     * @param baseOperatorResult
     */
    protected static void assembleOperateInfo4Result(BaseOperatorDomain baseOperatorDomain, BaseOperatorResult baseOperatorResult) {
        baseOperatorResult.setGmtCreate(baseOperatorDomain.getGmtCreate());
        baseOperatorResult.setUidCreate(baseOperatorDomain.getUidCreate());
        baseOperatorResult.setUnameCreate(baseOperatorDomain.getUnameCreate());

        baseOperatorResult.setGmtModify(baseOperatorDomain.getGmtModify());
        baseOperatorResult.setUidModify(baseOperatorDomain.getUidModify());
        baseOperatorResult.setUnameModify(baseOperatorDomain.getUnameModify());
    }

    /**
     * 将Domain列表转为Result列表
     *
     * @param domainList Domain列表
     * @param mapper     将Domain转为Result的方法
     * @param <T>        Domain类
     * @param <R>        Result类
     * @return Result列表
     */
    protected static <T extends BaseDomain, R extends BaseResult> List<R> assembleDomainList2ResultList(List<T> domainList, Function<? super T, ? extends R> mapper) {
        return domainList != null ? domainList.stream().map(mapper).collect(Collectors.toList()) : null;
    }
}