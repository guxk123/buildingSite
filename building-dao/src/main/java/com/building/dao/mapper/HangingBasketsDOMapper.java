/*
* HangingBasketsDOMapper.java
* Copyright(C) 2017-2025 上海凌边信息科技
* @date 2023-12-01 13:22:03
*/
package com.building.dao.mapper;

import com.building.dao.entity.HangingBasketsDO;
import com.building.dao.entity.HangingBasketsDOExample;
import java.util.List;

public interface HangingBasketsDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HangingBasketsDO record);

    int insertSelective(HangingBasketsDO record);

    List<HangingBasketsDO> selectByExample(HangingBasketsDOExample example);

    HangingBasketsDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HangingBasketsDO record);

    int updateByPrimaryKey(HangingBasketsDO record);
}