package com.upday.domain.aggregate.order.dto;/**
 * Create by xdd on 2023/3/23.
 */

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import lombok.Data;
import lombok.Getter;

/**
 * @author xdd
 */
@Data
public class OrderDTO {

  // 用户Id
  private Long userId;

  // 下单项信息
  private List<OrderItemDTO> orderItems;

  // 用户地址
  private Long userAddressId;
}
