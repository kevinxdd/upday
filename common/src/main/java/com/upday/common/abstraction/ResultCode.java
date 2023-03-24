package com.upday.common.abstraction;

/**
 * @Description：
 * @Author： ZHL
 * @Date：2022/11/28
 * @Version: 1.0
 */
public interface ResultCode {
    Integer getCode();
    String getMessage();
    default String getName() {
        return ((Enum) this).name();
    }
    default String getClassName() {
        return ((Enum) this).getClass().getSimpleName();
    }
}
