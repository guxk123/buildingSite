/*
* RoleDO.java
* Copyright(C) 2017-2025 上海凌边信息科技
* @date 2023-12-01 13:22:03
*/
package com.building.dao.entity;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * @Title t_role表的实体类
 * @Description 角色表
 * @version 1.0
 * @Date 2023-12-01 13:22:03
 */
@ApiModel(value = "角色表")
public class RoleDO {
    @ApiModelProperty(value = "")
    private Integer id;

    @ApiModelProperty(value = "角色编码")
    private String roleCode;

    @ApiModelProperty(value = "角色名称")
    private String roleName;

    @ApiModelProperty(value = "备注")
    private String description;

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
     * 角色编码
     * @return role_code 角色编码
     */
    public String getRoleCode() {
        return roleCode;
    }

    /**
     * 角色编码
     * @param roleCode 角色编码
     */
    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    /**
     * 角色名称
     * @return role_name 角色名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 角色名称
     * @param roleName 角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * 备注
     * @return description 备注
     */
    public String getDescription() {
        return description;
    }

    /**
     * 备注
     * @param description 备注
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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