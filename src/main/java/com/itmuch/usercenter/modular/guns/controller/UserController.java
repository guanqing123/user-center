package com.itmuch.usercenter.modular.guns.controller;

import com.itmuch.usercenter.modular.guns.model.SysUser;
import com.itmuch.usercenter.modular.guns.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/11/28 16:17
 **/
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/{id}")
    public SysUser findById(@PathVariable Long id) {
        return sysUserService.findById(id);
    }
}
