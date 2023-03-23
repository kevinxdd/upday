package com.upday.domain.aggregate.order;
/**
 * Create by xdd on 2023/3/23.
 */

import lombok.Getter;

/**
 * 订单商品值对象
 * @author xdd
 */
@Getter
public class OrderGoodsValue {

  private Long goodsId;

  private String goodsName;
  private Long skuId;

  private String skuName;

  private String goodsPic;

  OrderGoodsValue(Long goodsId, String goodsName, Long skuId, String skuName,
      String goodsPic) {
    this.goodsId = goodsId;
    this.goodsName = goodsName;
    this.skuId = skuId;
    this.skuName = skuName;
    this.goodsPic = goodsPic;
  }
}
