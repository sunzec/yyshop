package com.yy.yyshop.dao;

import com.yy.yyshop.pojo.po.TbApply;
import com.yy.yyshop.pojo.po.TbApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbApplyMapper {
    int countByExample(TbApplyExample example);

    int deleteByExample(TbApplyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbApply record);

    int insertSelective(TbApply record);

    List<TbApply> selectByExampleWithBLOBs(TbApplyExample example);

    List<TbApply> selectByExample(TbApplyExample example);

    TbApply selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbApply record, @Param("example") TbApplyExample example);

    int updateByExampleWithBLOBs(@Param("record") TbApply record, @Param("example") TbApplyExample example);

    int updateByExample(@Param("record") TbApply record, @Param("example") TbApplyExample example);

    int updateByPrimaryKeySelective(TbApply record);

    int updateByPrimaryKeyWithBLOBs(TbApply record);

    int updateByPrimaryKey(TbApply record);
}