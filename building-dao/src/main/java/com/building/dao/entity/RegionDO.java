/*
* RegionDO.java
* Copyright(C) 2017-2025 上海凌边信息科技
* @date 2023-12-01 13:22:03
*/
package com.building.dao.entity;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * @Title t_region表的实体类
 * @Description 区域表
 * @version 1.0
 * @Date 2023-12-01 13:22:03
 */
@ApiModel(value = "区域表")
public class RegionDO {
    @ApiModelProperty(value = "")
    private Integer id;

    @ApiModelProperty(value = "区域编码")
    private String regionCode;

    @ApiModelProperty(value = "区域名称")
    private String regionName;

    @ApiModelProperty(value = "项目编码")
    private String projectCode;

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
     * 区域编码
     * @return region_code 区域编码
     */
    public String getRegionCode() {
        return regionCode;
    }

    /**
     * 区域编码
     * @param regionCode 区域编码
     */
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode == null ? null : regionCode.trim();
    }

    /**
     * 区域名称
     * @return region_name 区域名称
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * 区域名称
     * @param regionName 区域名称
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName == null ? null : regionName.trim();
    }

    /**
     * 项目编码
     * @return project_code 项目编码
     */
    public String getProjectCode() {
        return projectCode;
    }

    /**
     * 项目编码
     * @param projectCode 项目编码
     */
    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode == null ? null : projectCode.trim();
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