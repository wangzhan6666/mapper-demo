package com.wangzhan.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
* 目的：逆向生成Mapper
* 步骤：①添加mybatis、MySQL的依赖
*      ②编写GeneratorMapper.xml文件
*      ③配置数据库的连接信息
*
* */

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
