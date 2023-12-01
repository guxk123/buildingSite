/*
* LoginLogDOMapper.java
* Copyright(C) 2017-2025 上海凌边信息科技
* @date 2023-12-01 13:22:03
*/
package com.building.dao.mapper;

import com.building.dao.entity.LoginLogDO;
import com.building.dao.entity.LoginLogDOExample;
import java.util.List;

public interface LoginLogDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LoginLogDO record);

    int insertSelective(LoginLogDO record);

    List<LoginLogDO> selectByExample(LoginLogDOExample example);

    LoginLogDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LoginLogDO record);

    int updateByPrimaryKey(LoginLogDO record);
}