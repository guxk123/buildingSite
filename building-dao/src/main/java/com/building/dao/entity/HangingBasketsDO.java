/*
* HangingBasketsDO.java
* Copyright(C) 2017-2025 上海凌边信息科技
* @date 2023-12-01 13:22:03
*/
package com.building.dao.entity;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * @Title t_hanging_baskets表的实体类
 * @Description 吊蓝表
 * @version 1.0
 * @Date 2023-12-01 13:22:03
 */
@ApiModel(value = "吊蓝表")
public class HangingBasketsDO {
    @ApiModelProperty(value = "")
    private Integer id;

    @ApiModelProperty(value = "吊蓝编码")
    private String basketsCode;

    @ApiModelProperty(value = "吊蓝名称")
    private String basketsName;

    @ApiModelProperty(value = "吊蓝状态 NORMAL 正常 ERROR 异常")
    private String basketsStatus;

    @ApiModelProperty(value = "吊蓝地址")
    private String basketsAddress;

    @ApiModelProperty(value = "安装单位编码")
    private String companyCode;

    @ApiModelProperty(value = "吊蓝型号")
    private String basketsModel;

    @ApiModelProperty(value = "负责人")
    private String basketsManagerCode;

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
     * 吊蓝编码
     * @return baskets_code 吊蓝编码
     */
    public String getBasketsCode() {
        return basketsCode;
    }

    /**
     * 吊蓝编码
     * @param basketsCode 吊蓝编码
     */
    public void setBasketsCode(String basketsCode) {
        this.basketsCode = basketsCode == null ? null : basketsCode.trim();
    }

    /**
     * 吊蓝名称
     * @return baskets_name 吊蓝名称
     */
    public String getBasketsName() {
        return basketsName;
    }

    /**
     * 吊蓝名称
     * @param basketsName 吊蓝名称
     */
    public void setBasketsName(String basketsName) {
        this.basketsName = basketsName == null ? null : basketsName.trim();
    }

    /**
     * 吊蓝状态 NORMAL 正常 ERROR 异常
     * @return baskets_status 吊蓝状态 NORMAL 正常 ERROR 异常
     */
    public String getBasketsStatus() {
        return basketsStatus;
    }

    /**
     * 吊蓝状态 NORMAL 正常 ERROR 异常
     * @param basketsStatus 吊蓝状态 NORMAL 正常 ERROR 异常
     */
    public void setBasketsStatus(String basketsStatus) {
        this.basketsStatus = basketsStatus == null ? null : basketsStatus.trim();
    }

    /**
     * 吊蓝地址
     * @return baskets_address 吊蓝地址
     */
    public String getBasketsAddress() {
        return basketsAddress;
    }

    /**
     * 吊蓝地址
     * @param basketsAddress 吊蓝地址
     */
    public void setBasketsAddress(String basketsAddress) {
        this.basketsAddress = basketsAddress == null ? null : basketsAddress.trim();
    }

    /**
     * 安装单位编码
     * @return company_code 安装单位编码
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * 安装单位编码
     * @param companyCode 安装单位编码
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }

    /**
     * 吊蓝型号
     * @return baskets_model 吊蓝型号
     */
    public String getBasketsModel() {
        return basketsModel;
    }

    /**
     * 吊蓝型号
     * @param basketsModel 吊蓝型号
     */
    public void setBasketsModel(String basketsModel) {
        this.basketsModel = basketsModel == null ? null : basketsModel.trim();
    }

    /**
     * 负责人
     * @return baskets_manager_code 负责人
     */
    public String getBasketsManagerCode() {
        return basketsManagerCode;
    }

    /**
     * 负责人
     * @param basketsManagerCode 负责人
     */
    public void setBasketsManagerCode(String basketsManagerCode) {
        this.basketsManagerCode = basketsManagerCode == null ? null : basketsManagerCode.trim();
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