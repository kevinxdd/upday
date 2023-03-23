package com.upday.application.service.Impl;/**
 * Create by xdd on 2023/3/22.
 */

import com.upday.application.service.OrderService;
import com.upday.common.utils.EventSender;
import com.upday.domain.aggregate.goods.GoodsAggregate;
import com.upday.domain.aggregate.goods.repository.GoodsRepository;
import com.upday.domain.aggregate.order.dto.OrderDTO;
import com.upday.domain.aggregate.order.event.OrderEvent;
import com.upday.domain.aggregate.user.UserAggregate;
import com.upday.domain.aggregate.user.repository.UserRepository;
import com.upday.domain.aggregate.user.repository.UserRepositoryCondition;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author xdd
 */
@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

  private final UserRepository userRepository;

  private final GoodsRepository goodsRepository;

  public void submit(OrderDTO orderDTO){

    // 获取用户信息
    UserAggregate userAggregate = userRepository.find(
        UserRepositoryCondition.builder().userId(orderDTO.getUserId())
            .addressId(orderDTO.getUserAddressId()).build());

    // 获取商品信息
    List<GoodsAggregate> goodsAggregateList = orderDTO.getOrderItems().stream()
        .map(item -> goodsRepository.find(item.getGoodsId())).collect(
            Collectors.toList());

    // 锁定库存


    // 保存


    // 发送下单成功事件
    EventSender.send(new OrderEvent());
  }

}
