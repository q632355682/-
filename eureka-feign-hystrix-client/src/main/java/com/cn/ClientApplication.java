package com.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @program: springcloud-example
 * @description:
 * @author:
 * @create: 2018-06-15 15:51
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ClientApplication {


    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }


}
