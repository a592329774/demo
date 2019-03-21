package com.demo.userInfo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
@Mapper
public interface UserInfoDao {
    Map selectAll() ;

}
