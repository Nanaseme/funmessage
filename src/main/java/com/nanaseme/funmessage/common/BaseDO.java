package com.nanaseme.funmessage.common;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * DO 基类
 *
 * @author WangZD
 */
public abstract class BaseDO implements Serializable {

    /**
     * toString 重写
     *
     * @return
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
