package com.wangyi.timer.service.impl;

import com.wangyi.timer.dao.STimetask;
import com.wangyi.timer.dao.STimetaskExample;
import com.wangyi.timer.dao.STimetaskMapper;
import com.wangyi.timer.service.STimetaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:wangyi
 * @Date:2019/9/9
 */
@Service
public class STimetaskServiceImpl implements STimetaskService {
    @Autowired
    private STimetaskMapper timetaskMapper;

    @Override
    public List<STimetask> selectByExample(STimetaskExample example) {
        return timetaskMapper.selectByExample(example);
    }
}
