package com.upday.application.service;

import com.upday.domain.aggregate.order.dto.OrderDTO;
import com.upday.domain.aggregate.user.dto.UserAddressDTO;

/**
 * Create by xdd on 2023/3/22.
 */
public interface UserService {

  void updateAddress(UserAddressDTO dto,Long userId);

}
