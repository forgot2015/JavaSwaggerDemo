package com.example.swaggerdemo.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class User {
    /**
     * 唯一id
     */
    @ApiModelProperty(value = "用户id")
    private Integer id;

    /**
     * 用户登录名
     */
    @ApiModelProperty(value = "用户登录名")
    private String userName;

    /**
     * 用户昵称
     */
    @ApiModelProperty(value = "用户昵称")
    private String userNickname;

    /**
     * 登录密码base64
     */
    private String password;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /**
     * 修改时间
     */
    @ApiModelProperty(value = "修改时间")
    private Date updateTime;

    /**
     * 账号是否已删除
     */
    @ApiModelProperty(value = "账号是否已删除")
    private Byte isDelete;

    /**
     * 账号是否启用/被拉黑？
     */
    @ApiModelProperty(value = "账号是否启用")
    private Byte enable;

    /**
     * 性别，默认0，1男2女
     */
    @ApiModelProperty(value = "性别，默认0，1男2女")
    private Byte sex;

    /**
     * 生日 1990-08-15
     */
    @ApiModelProperty(value = "生日，如1990-08-15")
    private Date birthday;

    /**
     * 获取唯一id
     *
     * @return id - 唯一id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置唯一id
     *
     * @param id 唯一id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户登录名
     *
     * @return user_name - 用户登录名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户登录名
     *
     * @param userName 用户登录名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取用户昵称
     *
     * @return user_nickname - 用户昵称
     */
    public String getUserNickname() {
        return userNickname;
    }

    /**
     * 设置用户昵称
     *
     * @param userNickname 用户昵称
     */
    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    /**
     * 获取登录密码base64
     *
     * @return password - 登录密码base64
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置登录密码base64
     *
     * @param password 登录密码base64
     */
    public void setPassword(String password) {
        this.password = password;
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
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取账号是否已删除
     *
     * @return is_delete - 账号是否已删除
     */
    public Byte getIsDelete() {
        return isDelete;
    }

    /**
     * 设置账号是否已删除
     *
     * @param isDelete 账号是否已删除
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 获取账号是否启用/被拉黑？
     *
     * @return enable - 账号是否启用/被拉黑？
     */
    public Byte getEnable() {
        return enable;
    }

    /**
     * 设置账号是否启用/被拉黑？
     *
     * @param enable 账号是否启用/被拉黑？
     */
    public void setEnable(Byte enable) {
        this.enable = enable;
    }

    /**
     * 获取性别，默认0，1男2女
     *
     * @return sex - 性别，默认0，1男2女
     */
    public Byte getSex() {
        return sex;
    }

    /**
     * 设置性别，默认0，1男2女
     *
     * @param sex 性别，默认0，1男2女
     */
    public void setSex(Byte sex) {
        this.sex = sex;
    }

    /**
     * 获取生日 1990-08-15
     *
     * @return birthday - 生日 1990-08-15
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置生日 1990-08-15
     *
     * @param birthday 生日 1990-08-15
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}