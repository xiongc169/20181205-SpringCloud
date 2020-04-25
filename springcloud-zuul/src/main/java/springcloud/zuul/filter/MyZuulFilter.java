package springcloud.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SpringCloud之Zuul网关原理及其配置
 * https://www.cnblogs.com/jing99/p/11696192.html
 */
@Component
public class MyZuulFilter extends ZuulFilter {

    private static SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    /**
     * 过滤器的类型。可选值有：
     * pre - 前置过滤
     * route - 路由后过滤
     * error - 异常过滤
     * post - 远程服务调用后过滤
     */
    @Override
    public String filterType() {
        System.out.println(sdFormat.format(new Date()) + " zuul\\MyZuulFilter.filterType()");
        return "pre";
    }

    @Override
    public int filterOrder() {
        System.out.println(sdFormat.format(new Date()) + " zuul\\MyZuulFilter.filterOrder()");
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        System.out.println(sdFormat.format(new Date()) + " zuul\\MyZuulFilter.shouldFilter()");
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println(sdFormat.format(new Date()) + " zuul\\MyZuulFilter.run()");
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest servletRequest = requestContext.getRequest();
        System.out.println("servletRequest.getMethod(): " + servletRequest.getMethod());
        System.out.println("servletRequest.getRequestURI(): " + servletRequest.getRequestURI());
        return null;
    }
}
