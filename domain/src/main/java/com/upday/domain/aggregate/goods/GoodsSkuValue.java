package com.upday.domain.aggregate.goods;/**
 * Create by xdd on 2023/3/23.
 */

import lombok.Getter;

/**
 * @author xdd
 */
@Getter
public class GoodsSkuValue {

  private Long skuId;

  private String skuName;

  private String skuPic;

  private String price;

  GoodsSkuValue(Long skuId, String skuName, String skuPic, String price) {
    this.skuId = skuId;
    this.skuName = skuName;
    this.skuPic = skuPic;
    this.price = price;
  }
}
