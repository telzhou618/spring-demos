package com.example.mapper;

import com.example.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author gaojun.zhou
 * @date 2021/01/04
 */

public interface UserMapper {

    User selectById(Integer id);

    @Select("select * from tb_user")
    List<User> selectAll();
}
