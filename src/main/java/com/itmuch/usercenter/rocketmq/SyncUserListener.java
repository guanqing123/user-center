package com.itmuch.usercenter.rocketmq;

import com.itmuch.usercenter.modular.guns.mapper.SysUserMapper;
import com.itmuch.usercenter.modular.guns.model.SysUser;
import com.itmuch.usercenter.modular.guns.model.dto.SysUserDTO;
import lombok.RequiredArgsConstructor;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/12/7 22:05
 **/
@Service
@RocketMQMessageListener(consumerGroup = "consumer-group", topic = "sync_user")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class SyncUserListener implements RocketMQListener<SysUserDTO> {

    private final SysUserMapper sysUserMapper;

    @Override
    public void onMessage(SysUserDTO sysUserDTO) {
        /** 当收到消息的时候,执行的业务 */
        Integer userId = sysUserDTO.getUserId();
        SysUser sysUser = sysUserMapper.selectByPrimaryKey(userId);
        sysUser.setSex(sysUserDTO.getSex());
        sysUserMapper.updateByPrimaryKey(sysUser);
    }
}
