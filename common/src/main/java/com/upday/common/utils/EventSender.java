package com.upday.common.utils;/**
 * Create by xdd on 2023/3/23.
 */

import cn.hutool.extra.spring.SpringUtil;
import com.upday.common.event.Event;
import lombok.experimental.UtilityClass;
import org.springframework.context.ApplicationEventPublisher;

/**
 * @author xdd
 */
@UtilityClass
public class EventSender {

  public void send(Event event){
    ApplicationEventPublisher publisher = SpringUtil.getBean(ApplicationEventPublisher.class);
    publisher.publishEvent(event);
  }

}
