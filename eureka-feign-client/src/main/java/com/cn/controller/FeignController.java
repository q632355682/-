package com.cn.controller;

import com.cn.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: springcloud-example
 * @description:
 * @author:
 * @create: 2018-06-15 15:55
 **/
@RestController
public class FeignController {
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserFeign userFeign;

    @RequestMapping("/getUser")
    public String getUser() {
        return userFeign.getUser();
    }

    @GetMapping("/loadInstance")
    public String loadInstance() {
        ServiceInstance choose = this.loadBalancerClient.choose("client-87");
        System.out.println(choose.getServiceId()+":"+choose.getHost()+":"+choose.getPort());
        return choose.getServiceId() + ":" + choose.getHost() + ":" + choose.getPort();
    }

}
