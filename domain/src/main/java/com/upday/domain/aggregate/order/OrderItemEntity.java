package com.upday.domain.aggregate.order;
/**
 * Create by xdd on 2023/3/23.
 */


import lombok.Getter;

/**
 * 订单项实体
 * @author xdd
 */
@Getter
public class OrderItemEntity {

  private Long orderItemId;

  private OrderGoodsValue  orderGoods;

  private Integer quantity;

  private String status;

  OrderItemEntity(Long orderItemId, OrderGoodsValue orderGoods, Integer quantity,
      String status) {
    this.orderItemId = orderItemId;
    this.orderGoods = orderGoods;
    this.quantity = quantity;
    this.status = status;
  }
}
