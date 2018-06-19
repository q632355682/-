package com.cn.feign;

import org.springframework.stereotype.Component;

/**
 * @Description: 回调实现类
 * @Param:
 * @return:  
 * @Author:  
 * @Date: 2018/6/19 
 */ 
@Component
public class FeignClientFallback implements UserFeign {

    @Override
    public String getUser() {
        System.out.println("熔断，默认回调函数");
        return "{\"username\":\"admin\",\"age\":\"-1\"}";
    }
}