package com.shop.simpleshop.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://127.0.0.1:5500","http://127.0.0.1:3000","http://localhost:3000") // 허용할 오리진(Origin)을 여기에 설정
                .allowedMethods("GET", "POST", "PUT", "DELETE","PATCH") // 허용할 HTTP 메서드를 여기에 설정
                .allowedHeaders("Content-Type")// 허용할 헤더를 여기에 설정
                .allowCredentials(true)
                .maxAge(3600); // 인증 정보 허용 여부 설정
    }


}
