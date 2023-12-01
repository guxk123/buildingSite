/*
* UserDO.java
* Copyright(C) 2017-2025 上海凌边信息科技
* @date 2023-12-01 13:22:03
*/
package com.building.dao.entity;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * @Title t_user表的实体类
 * @Description 人员表
 * @version 1.0
 * @Date 2023-12-01 13:22:03
 */
@ApiModel(value = "人员表")
public class UserDO {
    @ApiModelProperty(value = "")
    private Integer id;

    @ApiModelProperty(value = "人员编码")
    private String userCode;

    @ApiModelProperty(value = "人员姓名")
    private String userName;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "手机号码")
    private String mobile;

    @ApiModelProperty(value = "数据状态 0在用 1删除")
    private Integer isDeleted;

    @ApiModelProperty(value = "创建人")
    private Integer createBy;

    @ApiModelProperty(value = "更新人")
    private Integer updateBy;

    @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 人员编码
     * @return user_code 人员编码
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * 人员编码
     * @param userCode 人员编码
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    /**
     * 人员姓名
     * @return user_name 人员姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 人员姓名
     * @param userName 人员姓名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 密码
     * @return password 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 手机号码
     * @return mobile 手机号码
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 手机号码
     * @param mobile 手机号码
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 数据状态 0在用 1删除
     * @return is_deleted 数据状态 0在用 1删除
     */
    public Integer getIsDeleted() {
        return isDeleted;
    }

    /**
     * 数据状态 0在用 1删除
     * @param isDeleted 数据状态 0在用 1删除
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * 创建人
     * @return create_by 创建人
     */
    public Integer getCreateBy() {
        return createBy;
    }

    /**
     * 创建人
     * @param createBy 创建人
     */
    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    /**
     * 更新人
     * @return update_by 更新人
     */
    public Integer getUpdateBy() {
        return updateBy;
    }

    /**
     * 更新人
     * @param updateBy 更新人
     */
    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     * @return update_time 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}