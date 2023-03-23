package com.upday.domain.aggregate.stock.repository;/**
 * Create by xdd on 2023/3/23.
 */

import com.upday.domain.aggregate.stock.StockAggregate;

/**
 * @author xdd
 */
public interface StockRepository {

  StockAggregate find(Long id);


  boolean save(StockAggregate userAggregate);
}
