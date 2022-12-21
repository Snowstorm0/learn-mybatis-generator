package com.spring.boot.dao;

import com.spring.boot.dao.model.UserDataPo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDataPoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserDataPo record);

    int insertSelective(UserDataPo record);

    UserDataPo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserDataPo record);

    int updateByPrimaryKey(UserDataPo record);
}