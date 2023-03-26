package com.upday.domain.aggregate.user;/**
 * Create by xdd on 2023/3/22.
 */

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.extra.spring.SpringUtil;
import com.upday.common.entity.Entity;
import com.upday.common.utils.AssertUtil;
import com.upday.domain.aggregate.user.dto.UserAddressDTO;
import com.upday.domain.aggregate.user.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import lombok.Getter;

/**
 * @author xdd
 */
@Getter
public class UserAggregate extends Entity {

  // 用户id
  private Long userId;

  // 用户姓名
  private String userName;

  // 用户手机好
  private Long mobile;

  // 用户地址
  private List<UserAddressEntity> userAddressList;



  /**
   * 获取指定的用户地址
   *
   * @param addressId 用户地址id
   * @return 用户地址实体Optional
   */
  public Optional<UserAddressEntity> address(Long addressId) {
    if (CollectionUtil.isNotEmpty(userAddressList)) {
      return userAddressList.stream()
          .filter(address -> addressId.equals(address.getAddressId())).findFirst();
    }
    return Optional.of(null);
  }


  /**
   * 获取指定的用户地址
   *
   * @return 用户地址实体Optional
   */
  public Optional<UserAddressEntity> addAddress(UserAddressDTO dto) {
    //UserAddressEntity.
    return Optional.of(null);
  }


  /**
   * 修改用户地址信息
   * @param dto 地址业务数据
   */
  public void updateAddress(UserAddressDTO dto) {

    Optional<UserAddressEntity> firstOptional = userAddressList.stream()
        .filter(address -> address.getAddressId().equals(dto.getAddressId())).findFirst();

    AssertUtil.isTrue(firstOptional.isPresent(),"修改用户地址不存在");

    firstOptional.get().update(dto);
  }

  /**
   * 删除用户地址
   * @param addressId
   */
  public void removeAddress(Long addressId) {
    Optional<UserAddressEntity> firstOptional = userAddressList.stream()
        .filter(address -> addressId.equals(address.getAddressId())).findFirst();

    AssertUtil.isTrue(firstOptional.isPresent(),"删除用户地址不存在");

    UserAddressEntity address = firstOptional.get();
    address.excision();
  }





}
