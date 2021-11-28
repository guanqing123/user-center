package com.itmuch.usercenter.modular.guns.model;

import java.util.Date;
import javax.persistence.*;

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

    /**
     * 获取主键id
     *
     * @return user_id - 主键id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置主键id
     *
     * @param userId 主键id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取头像
     *
     * @return avatar - 头像
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置头像
     *
     * @param avatar 头像
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 获取账号
     *
     * @return account - 账号
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置账号
     *
     * @param account 账号
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取md5密码盐
     *
     * @return salt - md5密码盐
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 设置md5密码盐
     *
     * @param salt md5密码盐
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * 获取名字
     *
     * @return name - 名字
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名字
     *
     * @param name 名字
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取生日
     *
     * @return birthday - 生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置生日
     *
     * @param birthday 生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取性别(字典)
     *
     * @return sex - 性别(字典)
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别(字典)
     *
     * @param sex 性别(字典)
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取电子邮件
     *
     * @return email - 电子邮件
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置电子邮件
     *
     * @param email 电子邮件
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取电话
     *
     * @return phone - 电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话
     *
     * @param phone 电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取角色id(多个逗号隔开)
     *
     * @return role_id - 角色id(多个逗号隔开)
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * 设置角色id(多个逗号隔开)
     *
     * @param roleId 角色id(多个逗号隔开)
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取部门id(多个逗号隔开)
     *
     * @return dept_id - 部门id(多个逗号隔开)
     */
    public Long getDeptId() {
        return deptId;
    }

    /**
     * 设置部门id(多个逗号隔开)
     *
     * @param deptId 部门id(多个逗号隔开)
     */
    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    /**
     * 获取状态(字典)
     *
     * @return status - 状态(字典)
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态(字典)
     *
     * @param status 状态(字典)
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取创建人
     *
     * @return create_user - 创建人
     */
    public Long getCreateUser() {
        return createUser;
    }

    /**
     * 设置创建人
     *
     * @param createUser 创建人
     */
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取更新人
     *
     * @return update_user - 更新人
     */
    public Long getUpdateUser() {
        return updateUser;
    }

    /**
     * 设置更新人
     *
     * @param updateUser 更新人
     */
    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * 获取乐观锁
     *
     * @return version - 乐观锁
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设置乐观锁
     *
     * @param version 乐观锁
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
}