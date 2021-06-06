package com.example.service;

import com.example.entity.Blog;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zhougaojun
 */
@Service
@AllArgsConstructor
public class BlogService {

    private final JdbcTemplate jdbcTemplate;

    public Blog findById(Integer id) {
        String sql = "select * from blog where id = ?";
        RowMapper<Blog> rowMapper = new BeanPropertyRowMapper<Blog>(Blog.class);
        return jdbcTemplate.queryForObject(sql, rowMapper, id);
    }

    public List<Blog> findAll() {
        String sql = "select * from blog";
        RowMapper<Blog> rowMapper = new BeanPropertyRowMapper<Blog>(Blog.class);
        return jdbcTemplate.query(sql, rowMapper);
    }

    @Transactional(rollbackFor = Exception.class)
    public int insert(Blog blog) {
        String sql = "insert into blog(title,content) value(?,?)";
        Object[] args = new Object[]{blog.getTitle(), blog.getContent()};
        int ret = jdbcTemplate.update(sql, args);
        System.out.println(1 / 0);
        return ret;
    }

}
