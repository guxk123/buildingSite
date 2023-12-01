/*
* DevicesDOMapper.java
* Copyright(C) 2017-2025 上海凌边信息科技
* @date 2023-12-01 13:22:03
*/
package com.building.dao.mapper;

import com.building.dao.entity.DevicesDO;
import com.building.dao.entity.DevicesDOExample;
import java.util.List;

public interface DevicesDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DevicesDO record);

    int insertSelective(DevicesDO record);

    List<DevicesDO> selectByExample(DevicesDOExample example);

    DevicesDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DevicesDO record);

    int updateByPrimaryKey(DevicesDO record);
}