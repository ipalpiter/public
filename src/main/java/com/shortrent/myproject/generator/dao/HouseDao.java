package com.shortrent.myproject.generator.dao;

import com.shortrent.myproject.generator.model.House;
import com.shortrent.myproject.generator.model.HouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HouseDao {
    long countByExample(HouseExample example);

    int deleteByExample(HouseExample example);

    int deleteByPrimaryKey(Integer hId);

    int insert(House record);

    int insertSelective(House record);

    List<House> selectByExample(HouseExample example);

    House selectByPrimaryKey(Integer hId);

    int updateByExampleSelective(@Param("record") House record, @Param("example") HouseExample example);

    int updateByExample(@Param("record") House record, @Param("example") HouseExample example);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);
}