package com.itmuch.usercenter.modular.guns.controller;

import com.google.common.collect.Maps;
import com.itmuch.usercenter.auth.CheckLogin;
import com.itmuch.usercenter.modular.guns.model.SysUser;
import com.itmuch.usercenter.modular.guns.model.dto.user.JwtTokenRespDTO;
import com.itmuch.usercenter.modular.guns.model.dto.user.LoginRespDTO;
import com.itmuch.usercenter.modular.guns.model.dto.user.UserLoginDTO;
import com.itmuch.usercenter.modular.guns.model.dto.user.UserRespDTO;
import com.itmuch.usercenter.modular.guns.service.SysUserService;
import com.itmuch.usercenter.util.JwtOperator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;
import java.util.Objects;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/11/28 16:17
 **/
@Slf4j
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {

    @Autowired
    private SysUserService sysUserService;

    private final JwtOperator jwtOperator;

    @GetMapping("/{id}")
    @CheckLogin
    public SysUser findById(@PathVariable Long id) {
        log.info("我被请求了...");
        return sysUserService.findById(id);
    }

    @GetMapping("/search")
    public SysUser search(SysUser user) {
        return user;
    }

    @PostMapping("/login")
    public LoginRespDTO login(@RequestBody UserLoginDTO loginDTO){
        SysUser sysUser = sysUserService.getUser(loginDTO);

        /** 非空检验 */
        if (Objects.isNull(sysUser)) {
            throw new IllegalArgumentException("账号或密码错误");
        }

        /** 颁发token */
        Map<String, Object> userInfo = Maps.newHashMap();
        userInfo.put("userId", sysUser.getUserId());
        userInfo.put("name", sysUser.getName());

        String token = jwtOperator.generateToken(userInfo);

        Date expirationDateFromToken = jwtOperator.getExpirationDateFromToken(token);
        log.info(
                "用户{}登录成功,生成的 token = {}, 有效期至: {}",
                sysUser.getName(),
                token,
                expirationDateFromToken
        );


        return LoginRespDTO.builder()
                .user(UserRespDTO.builder()
                        .userId(sysUser.getUserId())
                        .account(sysUser.getAccount())
                        .avatar(sysUser.getAvatar())
                        .name(sysUser.getName())
                        .build()
                )
                .token(JwtTokenRespDTO.builder()
                        .token(token)
                        .expirationTime(expirationDateFromToken.getTime())
                        .build())
                .build();
    }
}
