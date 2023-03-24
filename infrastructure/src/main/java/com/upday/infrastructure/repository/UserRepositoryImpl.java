package com.upday.infrastructure.repository;/**
 * Create by xdd on 2023/3/22.
 */

import com.upday.domain.aggregate.user.UserAggregate;
import com.upday.domain.aggregate.user.repository.UserRepository;
import com.upday.domain.aggregate.user.repository.UserRepositoryCondition;
import org.springframework.stereotype.Repository;

/**
 * @author xdd
 */

@Repository
public class UserRepositoryImpl implements UserRepository {

  @Override
  public UserAggregate find(Long userId) {
    return null;
  }

  @Override
  public UserAggregate find(UserRepositoryCondition condition) {
    // todo
    return null;
  }

  @Override
  public boolean save(UserAggregate userAggregate) {

    return false;
  }
}
