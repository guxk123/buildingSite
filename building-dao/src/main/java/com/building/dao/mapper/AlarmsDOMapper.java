/*
* AlarmsDOMapper.java
* Copyright(C) 2017-2025 上海凌边信息科技
* @date 2023-12-01 13:22:03
*/
package com.building.dao.mapper;

import com.building.dao.entity.AlarmsDO;
import com.building.dao.entity.AlarmsDOExample;
import java.util.List;

public interface AlarmsDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AlarmsDO record);

    int insertSelective(AlarmsDO record);

    List<AlarmsDO> selectByExample(AlarmsDOExample example);

    AlarmsDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AlarmsDO record);

    int updateByPrimaryKey(AlarmsDO record);
}