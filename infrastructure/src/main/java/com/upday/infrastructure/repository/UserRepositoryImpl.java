package com.upday.infrastructure.repository;/**
 * Create by xdd on 2023/3/22.
 */

import com.upday.common.enums.ChangingStatus;
import com.upday.domain.aggregate.user.UserAddressEntity;
import com.upday.domain.aggregate.user.UserAggregate;
import com.upday.domain.aggregate.user.repository.UserRepository;
import com.upday.domain.aggregate.user.repository.UserRepositoryCondition;
import com.upday.infrastructure.po.UserPO;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Repository;

/**
 * @author xdd
 */

@Repository
public class UserRepositoryImpl implements UserRepository {

  // 仓库 将聚合根转换成PO
  // 工厂 将PO转成聚合根


  @Override
  public UserAggregate find(Long userId) {

    // redis 从es 从db

    // rpc


    return null;
  }

  @Override
  public UserAggregate find(UserRepositoryCondition condition) {
    // todo
    return null;
  }

  @Override
  public boolean save(UserAggregate userAggregate) {

    // userAggregate
    userAggregate.getChangingStatus();

    List<UserAddressEntity> updateAddressList = userAggregate.getUserAddressList().stream()
        .filter(address -> address.getChangingStatus().equals(
            ChangingStatus.UPDATED)).collect(Collectors.toList());

    List<UserAddressEntity> deleteAddressList = userAggregate.getUserAddressList().stream()
        .filter(address -> address.getChangingStatus().equals(
            ChangingStatus.DELETED)).collect(Collectors.toList());

    UserPO userPO = new UserPO();

    // 修改updateAddressList

    // 保存db
    // 保存es

    // es 保存 redis

    return false;
  }
}
