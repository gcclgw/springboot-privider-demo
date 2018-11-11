package com.jk.utils.mysql;


import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynamicDataSource extends AbstractRoutingDataSource {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    protected Object determineCurrentLookupKey() {

        return JdbcContextHolder.getDataSource();
    }

}
