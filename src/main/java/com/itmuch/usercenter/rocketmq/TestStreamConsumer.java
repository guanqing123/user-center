package com.itmuch.usercenter.rocketmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Service;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/12/8 0:17
 **/
@Service
@Slf4j
public class TestStreamConsumer {

    @StreamListener(Sink.INPUT)
    public void receive(String messageBody) {
        log.info("通过stream收到了消息：messageBody = {}", messageBody);
    }
}
