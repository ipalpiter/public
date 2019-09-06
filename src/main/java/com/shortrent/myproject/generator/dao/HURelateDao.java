package com.shortrent.myproject.generator.dao;

import com.shortrent.myproject.generator.model.HURelate;
import com.shortrent.myproject.generator.model.HURelateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HURelateDao {
    long countByExample(HURelateExample example);

    int deleteByExample(HURelateExample example);

    int deleteByPrimaryKey(Integer rId);

    int insert(HURelate record);

    int insertSelective(HURelate record);

    List<HURelate> selectByExample(HURelateExample example);

    HURelate selectByPrimaryKey(Integer rId);

    int updateByExampleSelective(@Param("record") HURelate record, @Param("example") HURelateExample example);

    int updateByExample(@Param("record") HURelate record, @Param("example") HURelateExample example);

    int updateByPrimaryKeySelective(HURelate record);

    int updateByPrimaryKey(HURelate record);
}