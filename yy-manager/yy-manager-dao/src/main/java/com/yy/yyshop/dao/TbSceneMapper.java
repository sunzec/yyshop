package com.yy.yyshop.dao;

import com.yy.yyshop.pojo.po.TbScene;
import com.yy.yyshop.pojo.po.TbSceneExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbSceneMapper {
    int countByExample(TbSceneExample example);

    int deleteByExample(TbSceneExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbScene record);

    int insertSelective(TbScene record);

    List<TbScene> selectByExample(TbSceneExample example);

    TbScene selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbScene record, @Param("example") TbSceneExample example);

    int updateByExample(@Param("record") TbScene record, @Param("example") TbSceneExample example);

    int updateByPrimaryKeySelective(TbScene record);

    int updateByPrimaryKey(TbScene record);
}