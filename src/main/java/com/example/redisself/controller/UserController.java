package com.example.redisself.controller;

import com.example.redisself.entity.User;
import com.example.redisself.service.CacheUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api("自定义缓存")
@RequestMapping("/user")
public class UserController {
    @Autowired
    private CacheUser cacheUser;

    @PostMapping("/select")
    @ApiOperation(value = "自定义查找", notes = "查找")
    public User select(@RequestBody User user) {
        return cacheUser.selectById(user);

    }

    @PostMapping("/updateUser")
    @ApiOperation(value = "修改", notes = "修改")
    public User updateUser(@RequestBody User user) {
       return cacheUser.updateUser(user);
    }
    @PostMapping("/deleteUser")
    @ApiOperation(value = "修改", notes = "修改")
    public User deleteUser(@RequestBody User user) {
        return cacheUser.updateUser(user);
    }
}
