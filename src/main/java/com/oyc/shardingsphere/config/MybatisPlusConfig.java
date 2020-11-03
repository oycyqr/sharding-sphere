package com.oyc.shardingsphere.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Description:
 * @Author oyc
 * @Date 2020/11/04 7:46 下午
 */

//Spring boot方式
@EnableTransactionManagement
@Configuration
//扫描的mapper文件路径
@MapperScan(value = "com.oyc.shardingsphere.mapper")
public class MybatisPlusConfig {

    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
