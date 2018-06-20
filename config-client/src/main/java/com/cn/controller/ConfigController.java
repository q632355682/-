package com.cn.controller;/**
 * @Description: Created by xpl on 2018-06-20 22:58.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloud-example
 *
 * @description:
 *
 * @author:
 *
 * @create: 2018-06-20 22:58
 **/
@RestController
public class ConfigController {

    @Value("${version}")
    private String version;

    @RequestMapping("/getVersion")
    public String getVersion() {
        return this.version;
    }
}
