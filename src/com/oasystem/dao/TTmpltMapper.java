package com.oasystem.dao;

import com.oasystem.pojo.TTmplt;
import com.oasystem.pojo.TTmpltExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTmpltMapper {
    int countByExample(TTmpltExample example);

    int deleteByExample(TTmpltExample example);

    int insert(TTmplt record);

    int insertSelective(TTmplt record);

    List<TTmplt> selectByExample(TTmpltExample example);

    int updateByExampleSelective(@Param("record") TTmplt record, @Param("example") TTmpltExample example);

    int updateByExample(@Param("record") TTmplt record, @Param("example") TTmpltExample example);
}