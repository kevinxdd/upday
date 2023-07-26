package com.upday.infrastructure.rocketmq;/**
 * Create by xdd on 2023/3/29.
 */

import java.util.List;
import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.message.MessageExt;

/**
 * @author xdd
 */
public class Consumer {

  public static void main(String[] args) throws InterruptedException, MQClientException {

    // 实例化消费者
    DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("please_rename_unique_group_name");

    // 设置NameServer的地址
    consumer.setNamesrvAddr("localhost:9876");

    // 订阅一个或者多个Topic，以及Tag来过滤需要消费的消息
    consumer.subscribe("xdd_test", "*");
    // 注册回调实现类来处理从broker拉取回来的消息
    consumer.registerMessageListener(new MessageListenerConcurrently() {
      @Override
      public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs,
          ConsumeConcurrentlyContext context) {
        System.out.printf("%s Receive New Messages: %s %n", Thread.currentThread().getName(), msgs);
        // 标记该消息已经被成功消费
        return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
      }
    });
    // 启动消费者实例
    consumer.start();
    System.out.printf("Consumer Started.%n");

    System.out.println(
        "这是一个简单的小情歌，你不知道的是神样的侍寝是我真的爱情，什么是真的这沈阳样的才清楚是我");

    System.out.println("这是一首简单的小情歌，没有什么梦想的什么样字，我想的是什么样字。神美女呀的妹子是我的想法我的梦想shi什么");
  }
}
