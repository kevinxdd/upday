package com.upday.domain.aggregate.goods;
/**
 * Create by xdd on 2023/3/23.
 */

import java.util.List;
import lombok.Getter;

/**
 * @author xdd
 */
@Getter
public class GoodsAggregate {

  private Long goodsId;

  private Long goodsPic;

  private List<GoodsSkuValue> skus;

}
