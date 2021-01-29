package com.example.redisself.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration

@EnableSwagger2

public class Swagger2 {

    @Bean

    public Docket createRestApi() {

        return new Docket(DocumentationType.SWAGGER_2)

                .apiInfo(apiInfo())

                .select()

                .apis(RequestHandlerSelectors.basePackage("com.example.redisself.controller"))

                .paths(PathSelectors.any())

                .build();

    }

    private ApiInfo apiInfo() {

        return new ApiInfoBuilder()

                .title("jwt")

                .description("swagger")

                .termsOfServiceUrl("http://127.0.0.1:8081/swagger-ui.html")

                .contact("")

                .license("Copyright 2021 01-26 靳文涛")

                .version("1.0")

                .build();

    }



}
