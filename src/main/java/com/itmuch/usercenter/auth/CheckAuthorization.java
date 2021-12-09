package com.itmuch.usercenter.auth;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/**
 * 鉴权注解
 * @Author guanqing
 * @Date 2021/12/9 20:50
 **/
@Retention(RetentionPolicy.RUNTIME)
public @interface CheckAuthorization {
    String value();
}
