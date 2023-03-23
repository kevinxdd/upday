package com.upday.domain.aggregate.user.repository;/**
 * Create by xdd on 2023/3/23.
 */

import com.upday.domain.aggregate.user.UserAggregate;

/**
 * @author xdd
 */
public interface UserRepository {

  UserAggregate find(UserRepositoryCondition condition);


  boolean save(UserAggregate userAggregate);
}
