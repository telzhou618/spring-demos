package com.example.controller;

import com.alibaba.fastjson.JSON;
import com.example.annotation.SessionUserId;
import com.example.dto.BlogDTO;
import com.example.entity.Blog;
import com.example.service.BlogService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhougaojun
 */
@Controller
@AllArgsConstructor
public class BolgController {

    private BlogService blogService;

    @RequestMapping("/blog/detail")
    @ResponseBody
    public Blog blog(Integer id, @SessionUserId Integer userId) {
        System.out.println("userId:" + userId);
        return blogService.findById(id);
    }

    @RequestMapping("/blog/test")
    @ResponseBody
    public String blog(BlogDTO blogDTO) {
        System.out.println("blogDTO:" + JSON.toJSONString(blogDTO));
        return "success";
    }
}
