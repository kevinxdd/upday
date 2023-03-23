package com.upday.application.service.Impl;
/**
 * Create by xdd on 2023/3/22.
 */

import com.upday.application.service.OrderService;
import com.upday.common.utils.EventSender;
import com.upday.domain.aggregate.order.OrderAggregate;
import com.upday.domain.aggregate.order.dto.OrderDTO;
import com.upday.domain.aggregate.order.event.OrderEvent;
import com.upday.domain.aggregate.order.repository.OrderRepository;
import com.upday.domain.aggregate.order.service.OrderDomainService;
import com.upday.domain.aggregate.stock.StockAggregate;
import com.upday.domain.aggregate.stock.repository.StockRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author xdd
 */
@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

  private final OrderRepository orderRepository;
  private final OrderDomainService orderDomainService;

  private final StockRepository stockRepository;

  /**
   * 提交订单
   * @param orderDTO 提交数据体
   */
  public void submit(OrderDTO orderDTO){

    // 构建订单
    OrderAggregate orderAggregate = orderDomainService.buildOrderAggregate(orderDTO);
    // 锁定库存
    StockAggregate stockAggregate = new StockAggregate();

    // 保存
    orderRepository.save(orderAggregate);
    // 发送下单成功事件
    EventSender.send(new OrderEvent());
  }

}
