package com.upday.domain.aggregate.order;/**
 * Create by xdd on 2023/3/23.
 */

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import lombok.Getter;

/**
 * @author xdd
 */
@Getter
public class OrderAggregate {

  private String orderNo;

  private Long userId;

  private LocalDateTime createTime;

  private String status;

  private List<OrderItemEntity> orderItems;

  private OrderAddressValue orderAddress;

  public List<OrderItemEntity> getOrderItems() {
    return Collections.unmodifiableList(this.orderItems);
  }
}
