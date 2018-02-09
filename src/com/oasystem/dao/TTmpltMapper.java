package com.oasystem.dao;

import com.oasystem.pojo.TTmplt;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTmpltMapper {
    int insert(TTmplt record);

    int insertSelective(TTmplt record);
}