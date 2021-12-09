package com.itmuch.usercenter.modular.guns.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "sys_user")
public class SysUser {
    /**
     * 主键id
     */
    @Id
    @Column(name = "user_id")
    private Long userId;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 账号
     */
    private String account;

    /**
     * 密码
     */
    private String password;

    /**
     * md5密码盐
     */
    private String salt;

    /**
     * 名字
     */
    private String name;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 性别(字典)
     */
    private String sex;

    /**
     * 电子邮件
     */
    private String email;

    /**
     * 电话
     */
    private String phone;

    /**
     * 角色id(多个逗号隔开)
     */
    @Column(name = "role_id")
    private String roleId;

    /**
     * 部门id(多个逗号隔开)
     */
    @Column(name = "dept_id")
    private Long deptId;

    /**
     * 状态(字典)
     */
    private String status;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建人
     */
    @Column(name = "create_user")
    private Long createUser;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 更新人
     */
    @Column(name = "update_user")
    private Long updateUser;

    /**
     * 乐观锁
     */
    private Integer version;
}