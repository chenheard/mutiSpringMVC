package com.oasystem.dao;

import com.oasystem.pojo.TMenu;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMenuMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(TMenu record);

    int insertSelective(TMenu record);

    TMenu selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(TMenu record);

    int updateByPrimaryKey(TMenu record);
}