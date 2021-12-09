package com.itmuch.usercenter.modular.guns.model.dto.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/12/9 11:09
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginRespDTO {
    /** token */
    private JwtTokenRespDTO token;
    /** 用户信息 */
    private UserRespDTO user;
}
