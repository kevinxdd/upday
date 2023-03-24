package com.upday.common.abstraction;/**
 * Create by xdd on 2023/3/24.
 */

/**
 * @author xdd
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 通用响应对象
 *
 * @author zhaoyong_sh
 * @see CommonResponse
 * @since 2021-03-29 14:25
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponse<T> {

  private Integer code;

  private String msg;

  private T data;

  public static <T> CommonResponse<T> success() {
    return success(null);
  }

  public static <T> CommonResponse<T> success(T data) {
    return success(200, "success", data);
  }

  public static <T> CommonResponse<T> success(Integer code, String message, T data) {
    return new CommonResponse<>(code, message, data);
  }

  public static <T> CommonResponse<T> fail(String msg) {
    return error(400, msg, null);
  }

  public static <T> CommonResponse<T> error(Integer code, String message) {
    return error(code, message, null);
  }

  public static <T> CommonResponse<T> warn(String msg) {
    // 不触发日志告警
    return error(9998, msg, null);
  }

  public static <T> CommonResponse<T> error(String msg) {
    // 触发日志告警
    return error(9999, msg, null);
  }

  public static <T> CommonResponse<T> error(Integer code, String message, T data) {
    return new CommonResponse<>(code, message, data);
  }

}