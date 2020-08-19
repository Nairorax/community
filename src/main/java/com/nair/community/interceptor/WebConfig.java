package com.nair.community.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
//@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private  SessionInterceptor sessionInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        // addPathPatterns 拦截指定地址，excludePathPatterns 略过指定地址
        registry.addInterceptor(sessionInterceptor).addPathPatterns("/**");
    }
}
