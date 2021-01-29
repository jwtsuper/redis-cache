package com.example.redisself.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User  {
    /*实体类需要序列化
    *
    * 如果不序列号，需要配置redis序列化
    * */
    private int id;
    private String name;
}
