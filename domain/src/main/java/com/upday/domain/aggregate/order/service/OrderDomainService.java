package com.upday.domain.aggregate.order.service;/**
 * Create by xdd on 2023/3/23.
 */

import com.upday.domain.aggregate.order.OrderAggregate;
import com.upday.domain.aggregate.order.dto.OrderDTO;

/**
 * @author xdd
 */
public interface OrderDomainService {

  OrderAggregate buildOrderAggregate(OrderDTO orderDTO);
}
