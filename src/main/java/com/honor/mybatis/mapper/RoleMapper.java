package com.honor.mybatis.mapper;

import com.honor.mybatis.entity.Role;
import java.util.List;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    Role selectByPrimaryKey(Integer id);

    List<Role> selectAll();

    List<Role> selectRoleByUserId(Integer userId);

    int updateByPrimaryKey(Role record);
}