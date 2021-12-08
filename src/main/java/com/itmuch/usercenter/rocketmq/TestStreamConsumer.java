package com.itmuch.usercenter.rocketmq;

import com.itmuch.usercenter.modular.guns.mapper.SysUserMapper;
import com.itmuch.usercenter.modular.guns.model.SysUser;
import com.itmuch.usercenter.modular.guns.model.dto.SysUserDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Service;


/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/12/8 0:17
 **/
@Slf4j
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TestStreamConsumer {

    private final SysUserMapper sysUserMapper;

    @StreamListener(Sink.INPUT)
    public void receive(SysUserDTO sysUserDTO) {
        log.info("通过stream收到了消息：messageBody = {}", sysUserDTO);

        /** 当收到消息的时候,执行的业务 */
        Integer userId = sysUserDTO.getUserId();
        SysUser sysUser = sysUserMapper.selectByPrimaryKey(userId);
        sysUser.setSex(sysUserDTO.getSex());
        sysUserMapper.updateByPrimaryKey(sysUser);
        log.info("用户同步完毕...");
    }
}
