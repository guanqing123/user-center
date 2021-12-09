package com.itmuch.usercenter.rocketmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.ErrorMessage;
import org.springframework.stereotype.Service;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/12/8 0:17
 **/
@Service
@Slf4j
public class MyTestStreamConsumer {

    @StreamListener(MySink.MY_INPUT)
    public void receive(String messageBody) {
        log.info("通过stream收到了消息：messageBody = {}", messageBody);
        // throw new IllegalArgumentException("抛异常");
    }

    /**
     * 全局异常处理
     * @Author guanqing
     * @Date 2021/12/8 13:14
     **/
    @StreamListener("errorChannel")
    public void error(Message<?> message) {
        ErrorMessage errorMessage = (ErrorMessage) message;
        System.out.println("发生异常, errorMessage = {} " + errorMessage);
    }
}
