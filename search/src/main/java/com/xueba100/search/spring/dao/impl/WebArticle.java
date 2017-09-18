package com.xueba100.search.spring.dao.impl;

import com.xueba100.search.core.XueBaDataSource;
import com.xueba100.search.spring.model.WebArticleModel;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.Collections;
import java.util.Collections;
import java.util.List;
//import java.util.Map;

public class WebArticle {
    private XueBaDataSource xueBaDataSource;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public WebArticle() {
        xueBaDataSource = XueBaDataSource.getDataSource();
        setDataSource(xueBaDataSource);
    }

    public void setDataSource(DataSource dataSource) {
        namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List<WebArticleModel> get(int id) {
          List<WebArticleModel> articles = namedParameterJdbcTemplate.query("SELECT * FROM web_article WHERE id = :id", Collections.singletonMap("id", id),new RowMapper() {
            @Override
            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                WebArticleModel article = new WebArticleModel();
                article.setId(rs.getInt("id"));
                article.setTitle(rs.getString("title"));

                return article;
            }
        });

        return articles ;
    }

}