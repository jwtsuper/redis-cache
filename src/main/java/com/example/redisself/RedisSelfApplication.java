package com.example.redisself;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RedisSelfApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisSelfApplication.class, args);
	}

}
