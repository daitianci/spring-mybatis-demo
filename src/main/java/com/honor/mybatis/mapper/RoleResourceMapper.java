package com.honor.mybatis.mapper;

import com.honor.mybatis.entity.RoleResource;
import java.util.List;

public interface RoleResourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RoleResource record);

    RoleResource selectByPrimaryKey(Integer id);

    List<RoleResource> selectAll();

    int updateByPrimaryKey(RoleResource record);
}