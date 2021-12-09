package com.itmuch.usercenter.modular.guns.model.dto.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/12/9 11:05
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRespDTO {
    /** 用户id */
    private Long userId;
    /** 头像 */
    private String avatar;
    /** 账号 */
    private String account;
    /** 姓名 */
    private String name;
}
