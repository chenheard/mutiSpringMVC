package com.oasystem.dao;

import com.oasystem.pojo.TUser;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TUser record);

    int insertSelective(TUser record);
   
    TUser selectByNamePwd(TUser tuser); /*ÓÃ»§µÇÂ¼*/

    TUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
}