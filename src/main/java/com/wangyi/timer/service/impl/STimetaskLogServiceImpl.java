package com.wangyi.timer.service.impl;

import com.wangyi.timer.dao.STimetaskLog;
import com.wangyi.timer.dao.STimetaskLogMapper;
import com.wangyi.timer.service.STimetaskLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author:wangyi
 * @Date:2019/9/9
 */
@Service
public class STimetaskLogServiceImpl implements STimetaskLogService {
    @Autowired
    private STimetaskLogMapper timetaskLogMapper;

    @Override
    public int insertSelective(STimetaskLog tlog) {
       return timetaskLogMapper.insert(tlog);
    }
}
