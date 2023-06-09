package com.upday.domain.aggregate.order.service.impl;/**
 * Create by xdd on 2023/3/23.
 */

import com.upday.domain.aggregate.goods.GoodsAggregate;
import com.upday.domain.aggregate.goods.repository.GoodsRepository;
import com.upday.domain.aggregate.order.OrderAggregate;
import com.upday.domain.aggregate.order.dto.OrderDTO;
import com.upday.domain.aggregate.order.service.OrderDomainService;
import com.upday.domain.aggregate.user.UserAggregate;
import com.upday.domain.aggregate.user.repository.UserRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author xdd
 */
@Service
@RequiredArgsConstructor
public class OrderDomainServiceImpl implements OrderDomainService {

  private final UserRepository userRepository;

  private final GoodsRepository goodsRepository;

  @Override
  public OrderAggregate buildOrderAggregate(OrderDTO orderDTO) {

    // 获取用户信息
    UserAggregate userAggregate = userRepository.find(orderDTO.getUserId());

    // 获取商品信息
    List<GoodsAggregate> goodsAggregateList = orderDTO.getOrderItems().stream()
        .map(item -> goodsRepository.find(item.getGoodsId())).collect(
            Collectors.toList());

    // build
    return new OrderAggregate();
  }
}
