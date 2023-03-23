package com.upday.domain.aggregate.goods.repository;/**
 * Create by xdd on 2023/3/23.
 */

import com.upday.domain.aggregate.goods.GoodsAggregate;
import com.upday.domain.aggregate.user.UserAggregate;

/**
 * @author xdd
 */
public interface GoodsRepository {

  GoodsAggregate find(Long id);


  boolean save(GoodsAggregate userAggregate);
}
