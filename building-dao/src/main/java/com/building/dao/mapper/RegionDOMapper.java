/*
* RegionDOMapper.java
* Copyright(C) 2017-2025 上海凌边信息科技
* @date 2023-12-01 13:22:03
*/
package com.building.dao.mapper;

import com.building.dao.entity.RegionDO;
import com.building.dao.entity.RegionDOExample;
import java.util.List;

public interface RegionDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RegionDO record);

    int insertSelective(RegionDO record);

    List<RegionDO> selectByExample(RegionDOExample example);

    RegionDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RegionDO record);

    int updateByPrimaryKey(RegionDO record);
}