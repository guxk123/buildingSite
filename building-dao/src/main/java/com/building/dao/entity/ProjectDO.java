/*
* ProjectDO.java
* Copyright(C) 2017-2025 上海凌边信息科技
* @date 2023-12-01 13:22:03
*/
package com.building.dao.entity;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * @Title t_project表的实体类
 * @Description 项目表
 * @version 1.0
 * @Date 2023-12-01 13:22:03
 */
@ApiModel(value = "项目表")
public class ProjectDO {
    @ApiModelProperty(value = "")
    private Integer id;

    @ApiModelProperty(value = "项目编码")
    private String projectCode;

    @ApiModelProperty(value = "项目名称")
    private String projectName;

    @ApiModelProperty(value = "行政区")
    private String zoneCode;

    @ApiModelProperty(value = "项目图片")
    private String projectPicture;

    @ApiModelProperty(value = "项目状态 拟立项 ESTABLISHED 审批中 UNDER_APPROVAL 实施中 IMPLEMENTATION 已竣工 COMPLETED")
    private String projectStatus;

    @ApiModelProperty(value = "项目地址")
    private String projectAddress;

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

    @ApiModelProperty(value = "项目简介")
    private String projectIntroduce;

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
     * 项目名称
     * @return project_name 项目名称
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * 项目名称
     * @param projectName 项目名称
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    /**
     * 行政区
     * @return zone_code 行政区
     */
    public String getZoneCode() {
        return zoneCode;
    }

    /**
     * 行政区
     * @param zoneCode 行政区
     */
    public void setZoneCode(String zoneCode) {
        this.zoneCode = zoneCode == null ? null : zoneCode.trim();
    }

    /**
     * 项目图片
     * @return project_picture 项目图片
     */
    public String getProjectPicture() {
        return projectPicture;
    }

    /**
     * 项目图片
     * @param projectPicture 项目图片
     */
    public void setProjectPicture(String projectPicture) {
        this.projectPicture = projectPicture == null ? null : projectPicture.trim();
    }

    /**
     * 项目状态 拟立项 ESTABLISHED 审批中 UNDER_APPROVAL 实施中 IMPLEMENTATION 已竣工 COMPLETED
     * @return project_status 项目状态 拟立项 ESTABLISHED 审批中 UNDER_APPROVAL 实施中 IMPLEMENTATION 已竣工 COMPLETED
     */
    public String getProjectStatus() {
        return projectStatus;
    }

    /**
     * 项目状态 拟立项 ESTABLISHED 审批中 UNDER_APPROVAL 实施中 IMPLEMENTATION 已竣工 COMPLETED
     * @param projectStatus 项目状态 拟立项 ESTABLISHED 审批中 UNDER_APPROVAL 实施中 IMPLEMENTATION 已竣工 COMPLETED
     */
    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus == null ? null : projectStatus.trim();
    }

    /**
     * 项目地址
     * @return project_address 项目地址
     */
    public String getProjectAddress() {
        return projectAddress;
    }

    /**
     * 项目地址
     * @param projectAddress 项目地址
     */
    public void setProjectAddress(String projectAddress) {
        this.projectAddress = projectAddress == null ? null : projectAddress.trim();
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

    /**
     * 项目简介
     * @return project_introduce 项目简介
     */
    public String getProjectIntroduce() {
        return projectIntroduce;
    }

    /**
     * 项目简介
     * @param projectIntroduce 项目简介
     */
    public void setProjectIntroduce(String projectIntroduce) {
        this.projectIntroduce = projectIntroduce == null ? null : projectIntroduce.trim();
    }
}