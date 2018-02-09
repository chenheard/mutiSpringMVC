package com.oasystem.dao;

import com.oasystem.pojo.TRole;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRoleMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(TRole record);

    int insertSelective(TRole record);
    
    TRole selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(TRole record);

    int updateByPrimaryKey(TRole record);
}