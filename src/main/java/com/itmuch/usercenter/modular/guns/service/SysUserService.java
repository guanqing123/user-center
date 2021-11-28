package com.itmuch.usercenter.modular.guns.service;

import com.itmuch.usercenter.modular.guns.model.SysUser;

import java.io.Serializable;

public interface SysUserService {
    SysUser findById(Serializable id);
}
