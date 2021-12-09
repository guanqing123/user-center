package com.itmuch.usercenter.modular.guns.service;

import com.itmuch.usercenter.modular.guns.model.SysUser;
import com.itmuch.usercenter.modular.guns.model.dto.user.UserLoginDTO;

import java.io.Serializable;

public interface SysUserService {
    SysUser findById(Serializable id);

    SysUser getUser(UserLoginDTO loginDTO);
}
