package com.upday.application.service.Impl;/**
 * Create by xdd on 2023/3/26.
 */

import com.upday.application.service.UserService;
import com.upday.domain.aggregate.user.UserAddressEntity;
import com.upday.domain.aggregate.user.UserAggregate;
import com.upday.domain.aggregate.user.dto.UserAddressDTO;
import com.upday.domain.aggregate.user.repository.UserRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author xdd
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;

  /**
   * 修改用户地址
   * @param dto
   */
  public void updateAddress(UserAddressDTO dto,Long userId){



    // 这个人查出来
    UserAggregate userAggregate = userRepository.find(userId);

    // 修改
    userAggregate.updateAddress(dto);

    // 保存
    userRepository.save(userAggregate);

    // event 变动
  }



}
