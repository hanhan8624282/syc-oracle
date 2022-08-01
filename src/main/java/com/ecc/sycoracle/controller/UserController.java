package com.ecc.sycoracle.controller;

import com.ecc.sycoracle.mapper.UserMapper;
import com.ecc.sycoracle.pojo.User;
import com.ecc.sycoracle.service.UserService;
import com.ecc.sycoracle.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author sunyc
 * @create 2022-07-05 16:15
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserMapper userMapper;
    @Autowired
    UserService userService;
    @GetMapping("/list")
    public Result getAllList(){

        List<User> all = userMapper.getAll();
        all.forEach(System.out::println);

        List<User> list = userService.list();
        return Result.ok(list);
    }
}
