package com.cn.controller;

import com.cn.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloud-example
 * @description:
 * @author:
 * @create: 2018-06-15 15:55
 **/
@RestController
public class FeignController {

    @Autowired
    private UserFeign userFeign;

    @RequestMapping("/getUser")
    public String getUser() {
        return userFeign.getUser();
    }


}
