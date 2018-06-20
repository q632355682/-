package com.cn;

import com.cn.zuul.filter.RequestLogFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @program: springcloud-example
 * @description:
 * @author:
 * @create: 2018-06-20 14:20
 **/
@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }

    @Bean
    public RequestLogFilter getRequestLogFilter() {
        return new RequestLogFilter();
    }
}
