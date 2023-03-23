package com.upday.application.service;

import com.upday.domain.aggregate.order.dto.OrderDTO;

/**
 * Create by xdd on 2023/3/22.
 */
public interface OrderService {

  void submit(OrderDTO orderDTO);

}
