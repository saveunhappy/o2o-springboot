package com.imooc.o2o.config.dao;

import com.alibaba.druid.pool.DruidDataSource;
import com.imooc.o2o.util.DESUtil;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfiguration {
    @Value("${jdbc.driverClassName}")
    private String jdbcDriver;
    @Value("${jdbc.url}")
    private String jdbcUrl;
    @Value("${jdbc.username}")
    private String jdbcUsername;
    @Value("${jdbc.password}")
    private String jdbcPassword;

    @Bean(name = "dataSource")
    public DruidDataSource createDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(jdbcDriver);
        druidDataSource.setUrl(jdbcUrl);
        druidDataSource.setUsername(DESUtil.getDecryptString(jdbcUsername));
        druidDataSource.setPassword(DESUtil.getDecryptString(jdbcPassword));
        druidDataSource.setInitialSize(10);
        druidDataSource.setMaxActive(30);
        druidDataSource.setMaxWait(10000);
        return druidDataSource;
    }
}
