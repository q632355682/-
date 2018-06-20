package com.cn.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @program: springcloud-example
 * @description:
 * @author:
 * @create: 2018-06-20 16:53
 **/
public class RequestLogFilter extends ZuulFilter {

    private Logger logger = LoggerFactory.getLogger(RequestLogFilter.class);

    /**
     * @Description: 返回过滤器类型，就是上面介绍的那几种类型
     * @Param:
     * @return:
     * @Author:
     * @Date: 2018/6/20
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * @Description:指定过滤器执行的顺序
     * @Param:
     * @return:
     * @Author:
     * @Date: 2018/6/20
     */
    @Override
    public int filterOrder() {
        return 1;
    }

    /**
     * @Description:指定该过滤器是否执行
     * @Param:
     * @return:
     * @Author:
     * @Date: 2018/6/20
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /** 
     * @Description: 过滤器的具体方法逻辑 
     * @Param:
     * @return:  
     * @Author:
     * @Date: 2018/6/20 
     */ 
    @Override
    public Object run() {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        String url = request.getRequestURL().toString();
        logger.info("请求URL："+url);
        return null;
    }
}
