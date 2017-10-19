package com.taotao.mapper;

import com.taotao.pojo.TbItemParamDesc;
import com.taotao.pojo.TbItemParamDescQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbItemParamDescMapper {
    int countByExample(TbItemParamDescQuery example);

    int deleteByExample(TbItemParamDescQuery example);

    int deleteByPrimaryKey(Long itemId);

    int insert(TbItemParamDesc record);

    int insertSelective(TbItemParamDesc record);

    List<TbItemParamDesc> selectByExampleWithBLOBs(TbItemParamDescQuery example);

    List<TbItemParamDesc> selectByExample(TbItemParamDescQuery example);

    TbItemParamDesc selectByPrimaryKey(Long itemId);

    int updateByExampleSelective(@Param("record") TbItemParamDesc record, @Param("example") TbItemParamDescQuery example);

    int updateByExampleWithBLOBs(@Param("record") TbItemParamDesc record, @Param("example") TbItemParamDescQuery example);

    int updateByExample(@Param("record") TbItemParamDesc record, @Param("example") TbItemParamDescQuery example);

    int updateByPrimaryKeySelective(TbItemParamDesc record);

    int updateByPrimaryKeyWithBLOBs(TbItemParamDesc record);

    int updateByPrimaryKey(TbItemParamDesc record);
}