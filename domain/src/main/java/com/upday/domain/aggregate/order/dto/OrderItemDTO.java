package com.upday.domain.aggregate.order.dto;
/**
 * Create by xdd on 2023/3/23.
 */


import lombok.Data;
import lombok.Getter;

/**
 * 订单项实体
 * @author xdd
 */
@Data
public class OrderItemDTO {

  private Long goodsId;

  private Long skuId;

  private Integer quantity;

}
