package com.example.redisself.service;

import com.example.redisself.entity.User;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@CacheConfig(cacheNames = "user")
public class CacheUser {

    private static final Map<Integer,User> usermap = new HashMap<>();
    /*
    *
    * 该注解 value必填 否则报错
    *
    * */
    @Cacheable(key = "#user.id",unless="#result == null")
    public User selectById(User user) {
        usermap.put(user.getId(),user);


        System.out.println(user.getId());
        return usermap.get(user.getId());
       // userlist.add(new User(id,"xiaoming"+id));
    }
    @CachePut(key = "#user.id",unless="#result == null")
    public User updateUser(User user){
        usermap.put(user.getId(),user);
        return usermap.get(user.getId());
    }
}
