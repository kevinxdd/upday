package com.upday.domain.aggregate.user.repository;/**
 * Create by xdd on 2023/3/23.
 */

import lombok.Builder;
import lombok.Getter;

/**
 * @author xdd
 */
@Builder
@Getter
public class UserRepositoryCondition {

  private Long userId;

  private Long addressId;

}
