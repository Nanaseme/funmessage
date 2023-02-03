package com.nanaseme.funmessage.util;

import org.hibernate.validator.HibernateValidator;
import org.springframework.context.ApplicationContextException;
import org.springframework.util.CollectionUtils;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

/**
 * Java Bean Validation 工具类
 *
 * @author WangZD
 * @Date 2023/2/3 17:34
 */
public class ValidateUtil {
    /**
     * The generated ValidatorFactory and Validator instances are thread-safe and can be cached. As
     * Hibernate Validator uses the factory as context for caching constraint metadata, it is
     * recommended to work with one factory instance within an application.
     */
    private static final Validator HIBERNATE_FAST_FAIL_VALIDATOR = Validation.byProvider(HibernateValidator.class)
            .configure()
            .failFast(true)
            .buildValidatorFactory().getValidator();

    /**
     * 校验带 Java Validation 注解的 Bean 是否合法
     *
     * @param javaBean
     * @param groups
     * @param <T>
     */
    public static <T> void fastFailValidate(T javaBean, Class<?>... groups) {
        handleValidateResult(HIBERNATE_FAST_FAIL_VALIDATOR.validate(javaBean, groups));
    }

    /**
     * 处理 validate 结果
     *
     * @param violationSet
     * @param <T>
     */
    private static <T> void handleValidateResult(Set<ConstraintViolation<T>> violationSet) {
        if (CollectionUtils.isEmpty(violationSet)) {
            return;
        }
        StringBuilder errMsg = new StringBuilder();
        int num = 0;
        for (ConstraintViolation<T> tConstraintViolation : violationSet) {
            if (num++ > 0) {
                errMsg.append(", ");
            }
            errMsg.append(tConstraintViolation.getMessage());
        }
        throw new ApplicationContextException(errMsg.toString());
    }
}
