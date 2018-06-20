package com.cn;/**
 * @Description: Created by xpl on 2018-06-20 22:17.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @program: springcloud-example
 *
 * @description:
 *
 * @author:
 *
 * @create: 2018-06-20 22:17
 **/
@SpringBootApplication
@EnableConfigServer
public class ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }

}
