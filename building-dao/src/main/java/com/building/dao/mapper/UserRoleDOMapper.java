/*
* UserRoleDOMapper.java
* Copyright(C) 2017-2025 上海凌边信息科技
* @date 2023-12-01 13:22:03
*/
package com.building.dao.mapper;

import com.building.dao.entity.UserRoleDO;
import com.building.dao.entity.UserRoleDOExample;
import java.util.List;

public interface UserRoleDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRoleDO record);

    int insertSelective(UserRoleDO record);

    List<UserRoleDO> selectByExample(UserRoleDOExample example);

    UserRoleDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserRoleDO record);

    int updateByPrimaryKey(UserRoleDO record);
}