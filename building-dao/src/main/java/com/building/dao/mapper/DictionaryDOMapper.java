/*
* DictionaryDOMapper.java
* Copyright(C) 2017-2025 上海凌边信息科技
* @date 2023-12-01 13:22:03
*/
package com.building.dao.mapper;

import com.building.dao.entity.DictionaryDO;
import com.building.dao.entity.DictionaryDOExample;
import java.util.List;

public interface DictionaryDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DictionaryDO record);

    int insertSelective(DictionaryDO record);

    List<DictionaryDO> selectByExample(DictionaryDOExample example);

    DictionaryDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DictionaryDO record);

    int updateByPrimaryKey(DictionaryDO record);
}