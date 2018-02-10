package com.oasystem.dao;

import com.oasystem.pojo.TApproveOpinion;
import com.oasystem.pojo.TApproveOpinionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TApproveOpinionMapper {
    int countByExample(TApproveOpinionExample example);

    int deleteByExample(TApproveOpinionExample example);

    int deleteByPrimaryKey(Integer cId);

    int insert(TApproveOpinion record);

    int insertSelective(TApproveOpinion record);

    List<TApproveOpinion> selectByExample(TApproveOpinionExample example);

    TApproveOpinion selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") TApproveOpinion record, @Param("example") TApproveOpinionExample example);

    int updateByExample(@Param("record") TApproveOpinion record, @Param("example") TApproveOpinionExample example);

    int updateByPrimaryKeySelective(TApproveOpinion record);

    int updateByPrimaryKey(TApproveOpinion record);
}