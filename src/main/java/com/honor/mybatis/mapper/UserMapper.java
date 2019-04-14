package com.honor.mybatis.mapper;

import com.honor.mybatis.entity.User;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    List<User> selectUserByRoleId(Integer roleId);

    int updateByPrimaryKey(User record);
}