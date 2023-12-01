/*
* DictionaryDO.java
* Copyright(C) 2017-2025 上海凌边信息科技
* @date 2023-12-01 13:22:03
*/
package com.building.dao.entity;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * @Title t_dictionary表的实体类
 * @Description 系统数据字典表
 * @version 1.0
 * @Date 2023-12-01 13:22:03
 */
@ApiModel(value = "系统数据字典表")
public class DictionaryDO {
    @ApiModelProperty(value = "主键id")
    private Integer id;

    @ApiModelProperty(value = "父类id")
    private Integer parentId;

    @ApiModelProperty(value = "字典编号")
    private String dicNum;

    @ApiModelProperty(value = "字典代码")
    private String typeCode;

    @ApiModelProperty(value = "字典名称")
    private String typeName;

    @ApiModelProperty(value = "翻译值代码")
    private String value;

    @ApiModelProperty(value = "翻译值名称")
    private String valueName;

    @ApiModelProperty(value = "删除标记(0未删除  1删除)")
    private Integer isDeleted;

    @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

    @ApiModelProperty(value = "创建人id")
    private Integer createBy;

    @ApiModelProperty(value = "更新人id")
    private Integer updateBy;

    /**
     * 主键id
     * @return id 主键id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键id
     * @param id 主键id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 父类id
     * @return parent_id 父类id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 父类id
     * @param parentId 父类id
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 字典编号
     * @return dic_num 字典编号
     */
    public String getDicNum() {
        return dicNum;
    }

    /**
     * 字典编号
     * @param dicNum 字典编号
     */
    public void setDicNum(String dicNum) {
        this.dicNum = dicNum == null ? null : dicNum.trim();
    }

    /**
     * 字典代码
     * @return type_code 字典代码
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * 字典代码
     * @param typeCode 字典代码
     */
    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode == null ? null : typeCode.trim();
    }

    /**
     * 字典名称
     * @return type_name 字典名称
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * 字典名称
     * @param typeName 字典名称
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    /**
     * 翻译值代码
     * @return value 翻译值代码
     */
    public String getValue() {
        return value;
    }

    /**
     * 翻译值代码
     * @param value 翻译值代码
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * 翻译值名称
     * @return value_name 翻译值名称
     */
    public String getValueName() {
        return valueName;
    }

    /**
     * 翻译值名称
     * @param valueName 翻译值名称
     */
    public void setValueName(String valueName) {
        this.valueName = valueName == null ? null : valueName.trim();
    }

    /**
     * 删除标记(0未删除  1删除)
     * @return is_deleted 删除标记(0未删除  1删除)
     */
    public Integer getIsDeleted() {
        return isDeleted;
    }

    /**
     * 删除标记(0未删除  1删除)
     * @param isDeleted 删除标记(0未删除  1删除)
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
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
     * 创建人id
     * @return create_by 创建人id
     */
    public Integer getCreateBy() {
        return createBy;
    }

    /**
     * 创建人id
     * @param createBy 创建人id
     */
    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    /**
     * 更新人id
     * @return update_by 更新人id
     */
    public Integer getUpdateBy() {
        return updateBy;
    }

    /**
     * 更新人id
     * @param updateBy 更新人id
     */
    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }
}