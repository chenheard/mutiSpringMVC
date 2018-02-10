package com.oasystem.dao;

import com.oasystem.pojo.TDept;
import com.oasystem.pojo.TDeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDeptMapper {
    int countByExample(TDeptExample example);

    int deleteByExample(TDeptExample example);

    int deleteByPrimaryKey(Integer cId);

    int insert(TDept record);

    int insertSelective(TDept record);

    List<TDept> selectByExample(TDeptExample example);

    TDept selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") TDept record, @Param("example") TDeptExample example);

    int updateByExample(@Param("record") TDept record, @Param("example") TDeptExample example);

    int updateByPrimaryKeySelective(TDept record);

    int updateByPrimaryKey(TDept record);
}