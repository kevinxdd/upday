package com.upday.common.utils;/**
 * Create by xdd on 2022/10/14.
 */

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.exceptions.StatefulException;
import cn.hutool.core.util.StrUtil;
import com.upday.common.abstraction.CommonResponse;
import java.util.Collection;
import java.util.function.Supplier;
import lombok.experimental.UtilityClass;

/**
 * @author xdd
 */
@UtilityClass
public class AssertUtil {


    public void isTrue(boolean expression,String message) {
        isTrue(expression, 500, message);
    }

    public void isTrue(boolean expression, int code) {
        isTrue(expression, code, "");
    }

    public void isTrue(boolean expression, int code, String message) {
        isTrue(expression, code, () -> message);
    }

    public void isTrue(boolean expression, int code, Supplier<String> supplier) {
        if (!expression) {
            throwEx(code, supplier == null ? null : supplier.get());
        }
    }

    public void isFalse(boolean expression, int code) {
        isFalse(expression, code, null);
    }

    public void isFalse(boolean expression, int code, String message) {
        if (expression) {
            throwEx(code, message);
        }
    }


    public void isNull(Object obj, int code) {
        isNull(obj, code, null);
    }

    public void isNull(Object obj, int code, String message) {
        if (obj != null) {
            throwEx(code, message);
        }
    }


    public void isNotNull(Object obj, int code) {
        isNotNull(obj, code, null);
    }

    public void isNotNull(Object obj, int code, String message) {
        if (obj == null) {
            throwEx(code, message);
        }
    }

    public void isBlank(String str, int code) {
        isBlank(str, code, null);
    }

    public void isBlank(String str, int code, String message) {
        if (!StrUtil.isBlank(str)) {
            throwEx(code, message);
        }
    }

    public void isNotBlank(String str, int code) {
        isNotBlank(str, code, null);
    }

    public void isNotBlank(String str, int code, String message) {
        if (!StrUtil.isNotBlank(str)) {
            throwEx(code, message);
        }
    }

    public void isEmpty(Collection<?> collection, int code) {
        isEmpty(collection, code, null);
    }

    public void isEmpty(Collection<?> collection, int code, String message) {
        if (!CollectionUtil.isEmpty(collection)) {
            throwEx(code, message);
        }
    }

    public void isNotEmpty(Collection<?> collection, int code) {
        isNotEmpty(collection, code, null);
    }

    public void isNotEmpty(Collection<?> collection, int code, String message) {
        if (!CollectionUtil.isNotEmpty(collection)) {
            throwEx(code, message);
        }
    }



    public void isSuccess(CommonResponse response, int code) {
        isSuccess(response, code, null);
    }

    public void isSuccess(CommonResponse response, int code, String msg) {
        if (response == null ||
                response.getCode() == null ||
                !response.getCode().equals(200)) {
            throwEx(code, msg);
        }
    }

    private void throwEx(int code, String message) {
        throw new StatefulException(code,message);
    }

}
