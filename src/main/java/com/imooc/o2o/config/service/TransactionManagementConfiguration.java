package com.imooc.o2o.config.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;

/*
 *继承TransactionManagementConfigurer是开启annotation-driven
 */
@Configuration
public class TransactionManagementConfiguration implements TransactionManagementConfigurer {
    @Autowired
    private DataSource dataSource;
    @Override
    public TransactionManager annotationDrivenTransactionManager() {
        return new DataSourceTransactionManager(dataSource);
    }
}
