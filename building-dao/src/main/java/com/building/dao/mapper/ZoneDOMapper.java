/*
* ZoneDOMapper.java
* Copyright(C) 2017-2025 上海凌边信息科技
* @date 2023-12-01 13:22:03
*/
package com.building.dao.mapper;

import com.building.dao.entity.ZoneDO;
import com.building.dao.entity.ZoneDOExample;
import java.util.List;

public interface ZoneDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ZoneDO record);

    int insertSelective(ZoneDO record);

    List<ZoneDO> selectByExample(ZoneDOExample example);

    ZoneDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ZoneDO record);

    int updateByPrimaryKey(ZoneDO record);
}