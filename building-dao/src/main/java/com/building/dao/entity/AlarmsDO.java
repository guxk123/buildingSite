/*
* AlarmsDO.java
* Copyright(C) 2017-2025 上海凌边信息科技
* @date 2023-12-01 13:22:03
*/
package com.building.dao.entity;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * @Title t_alarms表的实体类
 * @Description 报警记录表
 * @version 1.0
 * @Date 2023-12-01 13:22:03
 */
@ApiModel(value = "报警记录表")
public class AlarmsDO {
    @ApiModelProperty(value = "")
    private Integer id;

    @ApiModelProperty(value = "关联编码")
    private String businessCode;

    @ApiModelProperty(value = "报警类型")
    private String alarmType;

    @ApiModelProperty(value = "状态 异常 正常")
    private String alarmStatus;

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
     * 关联编码
     * @return business_code 关联编码
     */
    public String getBusinessCode() {
        return businessCode;
    }

    /**
     * 关联编码
     * @param businessCode 关联编码
     */
    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode == null ? null : businessCode.trim();
    }

    /**
     * 报警类型
     * @return alarm_type 报警类型
     */
    public String getAlarmType() {
        return alarmType;
    }

    /**
     * 报警类型
     * @param alarmType 报警类型
     */
    public void setAlarmType(String alarmType) {
        this.alarmType = alarmType == null ? null : alarmType.trim();
    }

    /**
     * 状态 异常 正常
     * @return alarm_status 状态 异常 正常
     */
    public String getAlarmStatus() {
        return alarmStatus;
    }

    /**
     * 状态 异常 正常
     * @param alarmStatus 状态 异常 正常
     */
    public void setAlarmStatus(String alarmStatus) {
        this.alarmStatus = alarmStatus == null ? null : alarmStatus.trim();
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