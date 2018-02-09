package com.oasystem.dao;

import com.oasystem.pojo.TApproveOpinion;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TApproveOpinionMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(TApproveOpinion record);

    int insertSelective(TApproveOpinion record);

    TApproveOpinion selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(TApproveOpinion record);

    int updateByPrimaryKey(TApproveOpinion record);
}