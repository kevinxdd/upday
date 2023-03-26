package com.upday.domain.aggregate.order.event;/**
 * Create by xdd on 2023/3/23.
 */

import cn.hutool.extra.spring.SpringUtil;
import com.upday.common.event.Event;
import com.upday.domain.aggregate.order.OrderAggregate;
import com.upday.domain.aggregate.order.repository.OrderRepository;
import com.upday.domain.aggregate.user.UserAddressEntity;

/**
 * @author xdd
 */
public class OrderEvent implements Event {

  private Long orderId;

  private Integer status;

  private Integer type;

  private UserAddressEntity item;


}
