package com.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: springcloud-example
 * @description: 启动类
 * @author:
 * @create: 2018-06-15 15:43
 **/
@SpringBootApplication
@EnableEurekaServer
public class ServerApplication {


    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class,args);
    }

}
