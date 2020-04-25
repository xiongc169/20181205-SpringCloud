package springcloud.zuul.hystrix;

import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

/**
 * SpringCloud之Zuul网关原理及其配置
 * https://www.cnblogs.com/jing99/p/11696192.html
 */
@Component
public class MyFallbackProvider implements FallbackProvider {

    @Override
    public String getRoute() {
        //当前的fallback容错处理逻辑处理的是哪一个服务。可以使用通配符'*'表为全部的服务提供容错处理；
        // 如果只为某一个服务提供容错，返回对应服务的spring.application.name值。
        return null;
    }

    @Override
    public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
        return null;
    }
}
