package com.oasystem.dao;

import com.oasystem.pojo.TPermission;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPermissionMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(TPermission record);

    int insertSelective(TPermission record);

    TPermission selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(TPermission record);

    int updateByPrimaryKey(TPermission record);
}