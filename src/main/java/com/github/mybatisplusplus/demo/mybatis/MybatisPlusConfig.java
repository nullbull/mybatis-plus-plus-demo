package com.github.mybatisplusplus.demo.mybatis;

import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.github.mybatisplusplus.injector.MultiQueryInjector;
import com.github.mybatisplusplus.interceptor.MyInterceptor;
import org.apache.ibatis.plugin.Interceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author niuzhenhao
 * @date 2020/9/21 13:49
 * @desc
 */

@Configuration
public class MybatisPlusConfig {


    @Bean
    public Interceptor myInterceptor() {
        return new MyInterceptor();
    }


    @Bean
    public ISqlInjector multiQueryInjector() {
        return new MultiQueryInjector();
    }

}
