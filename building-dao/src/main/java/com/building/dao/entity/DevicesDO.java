/*
* DevicesDO.java
* Copyright(C) 2017-2025 上海凌边信息科技
* @date 2023-12-01 13:22:03
*/
package com.building.dao.entity;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * @Title t_devices表的实体类
 * @Description 设备表
 * @version 1.0
 * @Date 2023-12-01 13:22:03
 */
@ApiModel(value = "设备表")
public class DevicesDO {
    @ApiModelProperty(value = "")
    private Integer id;

    @ApiModelProperty(value = "设备编码")
    private String deviceCode;

    @ApiModelProperty(value = "设备类型 VEDIO_MONITOR 监控 SAFETY_ROPES 安全绳")
    private String deviceType;

    @ApiModelProperty(value = "设备名称")
    private String deviceName;

    @ApiModelProperty(value = "设备状态 正常 NORMAL 异常 ERROR")
    private String deviceStatus;

    @ApiModelProperty(value = "设备地址")
    private String deviceAddress;

    @ApiModelProperty(value = "设备监控链接")
    private String deviceMonitorUrl;

    @ApiModelProperty(value = "关联编码")
    private String relationCode;

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
     * 设备编码
     * @return device_code 设备编码
     */
    public String getDeviceCode() {
        return deviceCode;
    }

    /**
     * 设备编码
     * @param deviceCode 设备编码
     */
    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode == null ? null : deviceCode.trim();
    }

    /**
     * 设备类型 VEDIO_MONITOR 监控 SAFETY_ROPES 安全绳
     * @return device_type 设备类型 VEDIO_MONITOR 监控 SAFETY_ROPES 安全绳
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * 设备类型 VEDIO_MONITOR 监控 SAFETY_ROPES 安全绳
     * @param deviceType 设备类型 VEDIO_MONITOR 监控 SAFETY_ROPES 安全绳
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }

    /**
     * 设备名称
     * @return device_name 设备名称
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * 设备名称
     * @param deviceName 设备名称
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }

    /**
     * 设备状态 正常 NORMAL 异常 ERROR
     * @return device_status 设备状态 正常 NORMAL 异常 ERROR
     */
    public String getDeviceStatus() {
        return deviceStatus;
    }

    /**
     * 设备状态 正常 NORMAL 异常 ERROR
     * @param deviceStatus 设备状态 正常 NORMAL 异常 ERROR
     */
    public void setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus == null ? null : deviceStatus.trim();
    }

    /**
     * 设备地址
     * @return device_address 设备地址
     */
    public String getDeviceAddress() {
        return deviceAddress;
    }

    /**
     * 设备地址
     * @param deviceAddress 设备地址
     */
    public void setDeviceAddress(String deviceAddress) {
        this.deviceAddress = deviceAddress == null ? null : deviceAddress.trim();
    }

    /**
     * 设备监控链接
     * @return device_monitor_url 设备监控链接
     */
    public String getDeviceMonitorUrl() {
        return deviceMonitorUrl;
    }

    /**
     * 设备监控链接
     * @param deviceMonitorUrl 设备监控链接
     */
    public void setDeviceMonitorUrl(String deviceMonitorUrl) {
        this.deviceMonitorUrl = deviceMonitorUrl == null ? null : deviceMonitorUrl.trim();
    }

    /**
     * 关联编码
     * @return relation_code 关联编码
     */
    public String getRelationCode() {
        return relationCode;
    }

    /**
     * 关联编码
     * @param relationCode 关联编码
     */
    public void setRelationCode(String relationCode) {
        this.relationCode = relationCode == null ? null : relationCode.trim();
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