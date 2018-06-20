package com.cn;/**
 * @Description: Created by xpl on 2018-06-19 23:01.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @program: springcloud-example
 *
 * @description:
 *
 * @author: 535504
 *
 * @create: 2018-06-19 23:01
 **/
@SpringBootApplication
@EnableTurbine
public class TurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(TurbineApplication.class, args);
    }

}
