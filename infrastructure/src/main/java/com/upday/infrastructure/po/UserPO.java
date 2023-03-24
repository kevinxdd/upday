package com.upday.infrastructure.po;/**
 * Create by xdd on 2023/3/22.
 */

import com.upday.domain.aggregate.user.UserAddressEntity;
import lombok.Data;
import lombok.Getter;

/**
 * @author xdd
 */
@Data
public class UserPO {

  // 用户id
  private Long userId;

  // 用户姓名
  private String userName;

  // 用户手机好
  private Long mobile;

}
