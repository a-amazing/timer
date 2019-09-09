package com.wangyi.timer.dao;

import com.wangyi.timer.dao.STimetaskLog;

public interface STimetaskLogMapper {
    int insert(STimetaskLog record);

    int insertSelective(STimetaskLog record);
}