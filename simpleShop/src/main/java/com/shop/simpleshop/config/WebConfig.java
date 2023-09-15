package com.shop.simpleshop.config;

import com.shop.simpleshop.filter.LogFilter;
import com.shop.simpleshop.interceptor.LogInterceptor;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.Filter;

@Configuration
public class WebConfig implements WebMvcConfigurer {
//    @Bean
    public FilterRegistrationBean logFilter(){
        FilterRegistrationBean<Filter> filterFilterRegistrationBean = new FilterRegistrationBean<>();

        filterFilterRegistrationBean.setFilter(new LogFilter()); // 필터를 등록해준다.
        filterFilterRegistrationBean.setOrder(1); // 숫자가 낮을수록 먼저 동작한다.
        filterFilterRegistrationBean.addUrlPatterns("/*"); // 필터를 적용 시킬 URL 패턴을 적용한다.
        return filterFilterRegistrationBean;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LogInterceptor())
                .order(1)
                .addPathPatterns("/**")
                .excludePathPatterns("/css/*","/*.ico","/error");

        registry.addInterceptor(new LogInterceptor())
                .order(2)
                .addPathPatterns("/**")
                .excludePathPatterns("/","/api/**");
    }
}
