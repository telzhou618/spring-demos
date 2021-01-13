package com.example.mapper;

import com.example.entity.User;

/**
 * @author gaojun.zhou
 * @date 2021/01/04
 */

public interface UserMapper {

    User selectById(Integer id);
}
