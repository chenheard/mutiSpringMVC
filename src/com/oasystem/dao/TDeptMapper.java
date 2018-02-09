package com.oasystem.dao;
import com.oasystem.pojo.TDept;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDeptMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(TDept record);

    int insertSelective(TDept record);

    TDept selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(TDept record);

    int updateByPrimaryKey(TDept record);
}