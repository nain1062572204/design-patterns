package com.wang.mbg.mapper;

import com.wang.entity.UserInfoPO;

public interface UserInfoPOMapper {
    int deleteByPrimaryKey(Integer dno);

    int insert(UserInfoPO record);

    int insertSelective(UserInfoPO record);

    UserInfoPO selectByPrimaryKey(Integer dno);

    int updateByPrimaryKeySelective(UserInfoPO record);

    int updateByPrimaryKey(UserInfoPO record);
}