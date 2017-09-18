package com.xueba100.search.core;

import java.util.Map;

public class XueBaDataSource extends org.apache.commons.dbcp2.BasicDataSource
{
    public XueBaDataSource () {
        Map<String, String> config = new Config().getProperties();
        setDriverClassName(config.get("dbDriverClassName"));
        setUrl(config.get("dbUrl"));
        setUsername(config.get("dbUsername"));
        setPassword(config.get("dbPassword"));
        setInitialSize(50);
        setMaxTotal(200);
    }

    private static XueBaDataSource dataSource = null;

    public static XueBaDataSource getDataSource() {
        if( dataSource == null ) {
            dataSource = new XueBaDataSource();
        }

        return dataSource;
    }

}

