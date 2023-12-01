/*
* ProjectDOMapper.java
* Copyright(C) 2017-2025 上海凌边信息科技
* @date 2023-12-01 13:22:03
*/
package com.building.dao.mapper;

import com.building.dao.entity.ProjectDO;
import com.building.dao.entity.ProjectDOExample;
import java.util.List;

public interface ProjectDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProjectDO record);

    int insertSelective(ProjectDO record);

    List<ProjectDO> selectByExampleWithBLOBs(ProjectDOExample example);

    List<ProjectDO> selectByExample(ProjectDOExample example);

    ProjectDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProjectDO record);

    int updateByPrimaryKeyWithBLOBs(ProjectDO record);

    int updateByPrimaryKey(ProjectDO record);
}