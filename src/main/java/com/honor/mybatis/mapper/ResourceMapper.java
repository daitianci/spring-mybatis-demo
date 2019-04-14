package com.honor.mybatis.mapper;

import com.honor.mybatis.entity.Resource;

import java.util.List;
import java.util.Map;

public interface ResourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Resource record);

    int insertSelective(Resource record);

    Resource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Resource record);

    int updateByPrimaryKey(Resource record);

    List<Resource> selectByParams(Map params);
}