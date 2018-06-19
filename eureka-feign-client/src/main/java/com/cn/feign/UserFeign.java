package com.cn.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "CLIENT-87")
public interface UserFeign {

    @RequestMapping("/getUser")
    public String getUser();

}
