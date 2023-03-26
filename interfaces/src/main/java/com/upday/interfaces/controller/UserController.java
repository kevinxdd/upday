package com.upday.interfaces.controller;/**
 * Create by xdd on 2023/3/22.
 */

import com.upday.application.service.Impl.UserServiceImpl;
import com.upday.application.service.OrderService;
import com.upday.application.service.UserService;
import com.upday.domain.aggregate.user.dto.UserAddressDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xdd
 */
@RequiredArgsConstructor
@RestController
public class UserController {

  private final UserService userService;


  /**
   * 修改用户地址
   * @param dto
   * @param userId
   */
  @RequestMapping("address/update")
  public void updateUserAddress(@RequestBody UserAddressDTO dto,@RequestParam Long userId){
    userService.updateAddress(dto,userId);
  }




}
