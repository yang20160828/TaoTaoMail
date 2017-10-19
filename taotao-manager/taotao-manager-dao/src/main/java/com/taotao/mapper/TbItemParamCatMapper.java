package com.taotao.mapper;

import com.taotao.pojo.TbItemParamCat;
import com.taotao.pojo.TbItemParamCatQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbItemParamCatMapper {
    int countByExample(TbItemParamCatQuery example);

    int deleteByExample(TbItemParamCatQuery example);

    int deleteByPrimaryKey(Long id);

    int insert(TbItemParamCat record);

    int insertSelective(TbItemParamCat record);

    List<TbItemParamCat> selectByExample(TbItemParamCatQuery example);

    TbItemParamCat selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbItemParamCat record, @Param("example") TbItemParamCatQuery example);

    int updateByExample(@Param("record") TbItemParamCat record, @Param("example") TbItemParamCatQuery example);

    int updateByPrimaryKeySelective(TbItemParamCat record);

    int updateByPrimaryKey(TbItemParamCat record);
}