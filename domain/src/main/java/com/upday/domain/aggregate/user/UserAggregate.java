package com.upday.domain.aggregate.user;/**
 * Create by xdd on 2023/3/22.
 */

import lombok.Getter;

/**
 * @author xdd
 */
@Getter
public class UserAggregate {

  // 用户id
  private Long userId;

  // 用户姓名
  private String userName;

  // 用户手机好
  private Long mobile;

  // 用户地址
  private UserAddressEntity userAddress;

}
