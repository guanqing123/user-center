package com.itmuch.usercenter.modular.guns.service.impl;

import com.itmuch.usercenter.modular.guns.mapper.SysUserMapper;
import com.itmuch.usercenter.modular.guns.model.SysUser;
import com.itmuch.usercenter.modular.guns.model.dto.user.UserLoginDTO;
import com.itmuch.usercenter.modular.guns.service.SysUserService;
import com.itmuch.usercenter.util.JwtOperator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/11/28 18:57
 **/
@Slf4j
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class SysUserServiceImpl implements SysUserService {

    private final SysUserMapper sysUserMapper;

    @Override
    public SysUser findById(Serializable id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public SysUser getUser(UserLoginDTO loginDTO) {
        /** 验证账号密码 */
        SysUser sysUser = sysUserMapper.selectOne(
                SysUser.builder()
                        .account(loginDTO.getAccount())
                        .password(loginDTO.getPassword())
                        .build()
        );
        return sysUser;
    }
}
