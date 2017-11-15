package com.yy.yyshop.dao;

import com.yy.yyshop.pojo.po.TbLine;
import com.yy.yyshop.pojo.po.TbLineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbLineMapper {
    int countByExample(TbLineExample example);

    int deleteByExample(TbLineExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbLine record);

    int insertSelective(TbLine record);

    List<TbLine> selectByExample(TbLineExample example);

    TbLine selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbLine record, @Param("example") TbLineExample example);

    int updateByExample(@Param("record") TbLine record, @Param("example") TbLineExample example);

    int updateByPrimaryKeySelective(TbLine record);

    int updateByPrimaryKey(TbLine record);
}