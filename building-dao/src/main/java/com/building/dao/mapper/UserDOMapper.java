/*
* UserDOMapper.java
* Copyright(C) 2017-2025 上海凌边信息科技
* @date 2023-12-01 13:22:03
*/
package com.building.dao.mapper;

import com.building.dao.entity.UserDO;
import com.building.dao.entity.UserDOExample;
import java.util.List;

public interface UserDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserDO record);

    int insertSelective(UserDO record);

    List<UserDO> selectByExample(UserDOExample example);

    UserDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserDO record);

    int updateByPrimaryKey(UserDO record);
}