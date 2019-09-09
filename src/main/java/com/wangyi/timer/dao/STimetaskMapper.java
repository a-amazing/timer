package com.wangyi.timer.dao;

import com.wangyi.timer.dao.STimetask;
import com.wangyi.timer.dao.STimetaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface STimetaskMapper {
    int countByExample(STimetaskExample example);

    int deleteByExample(STimetaskExample example);

    int insert(STimetask record);

    int insertSelective(STimetask record);

    List<STimetask> selectByExample(STimetaskExample example);

    int updateByExampleSelective(@Param("record") STimetask record, @Param("example") STimetaskExample example);

    int updateByExample(@Param("record") STimetask record, @Param("example") STimetaskExample example);
}