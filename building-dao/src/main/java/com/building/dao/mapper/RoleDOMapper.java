/*
* RoleDOMapper.java
* Copyright(C) 2017-2025 上海凌边信息科技
* @date 2023-12-01 13:22:03
*/
package com.building.dao.mapper;

import com.building.dao.entity.RoleDO;
import com.building.dao.entity.RoleDOExample;
import java.util.List;

public interface RoleDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RoleDO record);

    int insertSelective(RoleDO record);

    List<RoleDO> selectByExample(RoleDOExample example);

    RoleDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RoleDO record);

    int updateByPrimaryKey(RoleDO record);
}