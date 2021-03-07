package com.yufatang.sportplay.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

// 全局配置类，配置跨域请求
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    /**
     * 1. 域访问的路径
     * 2. 请求来源
     * 3. 方法
     * 4. 允许携带（如token）
     * 5. 最大响应时间（生命周期）
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("Http://localhost:8080","null")
                .allowedMethods("GET","POST","PUT","OPTIONS","DELETE","HEAD")
                .allowCredentials(true)
                .maxAge(3600);
    }
}
