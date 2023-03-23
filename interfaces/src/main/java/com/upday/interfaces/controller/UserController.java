package com.upday.interfaces.controller;/**
 * Create by xdd on 2023/3/22.
 */

import com.upday.application.service.OrderService;
import lombok.RequiredArgsConstructor;

/**
 * @author xdd
 */
@RequiredArgsConstructor
public class UserController {

  private final OrderService orderService;

}
