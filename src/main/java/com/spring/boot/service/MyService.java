package com.spring.boot.service;

import com.spring.boot.dao.UserDataPoMapper;
import com.spring.boot.dao.model.UserDataPo;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * Service层
 *
 * @author 代码的路
 * @date 2022/6/8
 */

@Service
@EnableScheduling
public class MyService {

    @Resource
    UserDataPoMapper userDataPoMapper;

    // 删
    public void deleteByPrimaryKey(int id) {
        userDataPoMapper.deleteByPrimaryKey(id);
    }

    // 增
    public void insert(int id, String name) {
        UserDataPo po = new UserDataPo();
        po.setId(id);
        po.setName(name);
        userDataPoMapper.insert(po);
    }

    // 增
    public void insertSelective(int id, String name) {
        UserDataPo po = new UserDataPo();
        po.setId(id);
        po.setName(name);
        userDataPoMapper.insertSelective(po);
    }

    // 查
    public UserDataPo selectByPrimaryKey(int id) {
        return userDataPoMapper.selectByPrimaryKey(id);
    }

    // 改
    public int updateByPrimaryKeySelective(int id, String name) {
        UserDataPo po = new UserDataPo();
        po.setId(id);
        po.setName(name);
        return userDataPoMapper.updateByPrimaryKeySelective(po);
    }

    // 改
    public int updateByPrimaryKey(int id, String name) {
        UserDataPo po = new UserDataPo();
        po.setId(id);
        po.setName(name);
        return userDataPoMapper.updateByPrimaryKey(po);
    }

}
