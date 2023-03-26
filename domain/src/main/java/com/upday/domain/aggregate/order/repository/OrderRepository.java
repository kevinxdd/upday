package com.upday.domain.aggregate.order.repository;/**
 * Create by xdd on 2023/3/23.
 */

import com.upday.domain.aggregate.order.OrderAggregate;

/**
 * @author xdd
 */
public interface OrderRepository {

  OrderAggregate find(Long id);

  boolean save(OrderAggregate userAggregate);

}
