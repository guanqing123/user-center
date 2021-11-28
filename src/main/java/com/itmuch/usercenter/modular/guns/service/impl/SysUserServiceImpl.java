package com.itmuch.usercenter.modular.guns.service.impl;

import com.itmuch.usercenter.modular.guns.mapper.SysUserMapper;
import com.itmuch.usercenter.modular.guns.model.SysUser;
import com.itmuch.usercenter.modular.guns.service.SysUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/11/28 18:57
 **/
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class SysUserServiceImpl implements SysUserService {

    private final SysUserMapper sysUserMapper;

    @Override
    public SysUser findById(Serializable id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }
}
