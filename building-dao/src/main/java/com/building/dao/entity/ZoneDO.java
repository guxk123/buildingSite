/*
* ZoneDO.java
* Copyright(C) 2017-2025 上海凌边信息科技
* @date 2023-12-01 13:22:03
*/
package com.building.dao.entity;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * @Title t_zone表的实体类
 * @Description 上海市行政区字典表
 * @version 1.0
 * @Date 2023-12-01 13:22:03
 */
@ApiModel(value = "上海市行政区字典表")
public class ZoneDO {
    @ApiModelProperty(value = "")
    private Integer id;

    @ApiModelProperty(value = "行政区编码")
    private String zoneCode;

    @ApiModelProperty(value = "行政区名称")
    private String zoneName;

    @ApiModelProperty(value = "展示顺序 权重")
    private Integer orderIndex;

    @ApiModelProperty(value = "行政区等级 1-省级 2-区级")
    private Integer zoneLevel;

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
     * 行政区编码
     * @return zone_code 行政区编码
     */
    public String getZoneCode() {
        return zoneCode;
    }

    /**
     * 行政区编码
     * @param zoneCode 行政区编码
     */
    public void setZoneCode(String zoneCode) {
        this.zoneCode = zoneCode == null ? null : zoneCode.trim();
    }

    /**
     * 行政区名称
     * @return zone_name 行政区名称
     */
    public String getZoneName() {
        return zoneName;
    }

    /**
     * 行政区名称
     * @param zoneName 行政区名称
     */
    public void setZoneName(String zoneName) {
        this.zoneName = zoneName == null ? null : zoneName.trim();
    }

    /**
     * 展示顺序 权重
     * @return order_index 展示顺序 权重
     */
    public Integer getOrderIndex() {
        return orderIndex;
    }

    /**
     * 展示顺序 权重
     * @param orderIndex 展示顺序 权重
     */
    public void setOrderIndex(Integer orderIndex) {
        this.orderIndex = orderIndex;
    }

    /**
     * 行政区等级 1-省级 2-区级
     * @return zone_level 行政区等级 1-省级 2-区级
     */
    public Integer getZoneLevel() {
        return zoneLevel;
    }

    /**
     * 行政区等级 1-省级 2-区级
     * @param zoneLevel 行政区等级 1-省级 2-区级
     */
    public void setZoneLevel(Integer zoneLevel) {
        this.zoneLevel = zoneLevel;
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