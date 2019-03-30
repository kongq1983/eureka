package com.kq.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Component;

/**
 * FeignInterceptor
 * @author kq
 * @date 2019-03-30
 */
@Component
public class FeignInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate requestTemplate) {
        System.out.println("调用了FeignInterceptor");
        requestTemplate.header("source", "browse");
    }

}

