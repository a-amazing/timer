package com.wangyi.timer.service;

import com.wangyi.timer.dao.STimetask;
import com.wangyi.timer.dao.STimetaskExample;

import java.util.List;

/**
 * @author:wangyi
 * @Date:2019/9/9
 */
public interface STimetaskService {
    List<STimetask> selectByExample(STimetaskExample example);
}
