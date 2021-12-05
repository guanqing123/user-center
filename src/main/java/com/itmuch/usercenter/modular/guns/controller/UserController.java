package com.itmuch.usercenter.modular.guns.controller;

import com.itmuch.usercenter.modular.guns.model.SysUser;
import com.itmuch.usercenter.modular.guns.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/{id}")
    public SysUser findById(@PathVariable Long id) {
        log.info("我被请求了...");
        return sysUserService.findById(id);
    }

    @GetMapping("/search")
    public SysUser search(SysUser user) {
        return user;
    }
}
