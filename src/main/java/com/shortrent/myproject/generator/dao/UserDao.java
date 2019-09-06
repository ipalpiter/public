package com.shortrent.myproject.generator.dao;

import com.shortrent.myproject.generator.model.User;
import com.shortrent.myproject.generator.model.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer usrId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer usrId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}