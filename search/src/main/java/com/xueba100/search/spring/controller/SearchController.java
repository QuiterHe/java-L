package com.xueba100.search.spring.controller;

import com.xueba100.search.core.Config;
import com.xueba100.search.core.XueBaDataSource;
import com.xueba100.search.spring.dao.impl.WebArticle;
import com.xueba100.search.spring.model.WebArticleModel;
import com.xueba100.search.spring.util.security.AuthUtils;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;


@RestController
public class SearchController implements ServletContextAware {
    private ServletContext servletContext;
    private String version;

    @Autowired
    private AuthUtils authUtils;


    public static String day = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

    @PostConstruct
    public void postConstruct() {
        version = getVersion();
    }

    @RequestMapping(value = "/queryById", method = { RequestMethod.GET,
            RequestMethod.POST })
    @ResponseBody
    public String query(
            @RequestParam(value = "ids") String ids,
            @RequestParam(value = "user") String user,
            @RequestParam(value = "token") String token,
            @RequestParam(value = "task", required = false) String task,
            @RequestParam(value = "ipIn", required = false) String inIn,
            @RequestParam(value = "id", required = false) int id,
            HttpServletRequest request
    ) throws IOException
    {
        String result = "";

        // ids is empty
//        if( ids.matches("^\\s*$") ) {
//            return result;
//        }

//        Properties prop = new Properties();

//        String config = new Config().getProperties();
//        return config;

        List<WebArticleModel> list = new com.xueba100.search.spring.dao.impl.WebArticle().get(id);
        for( WebArticleModel l : list ) {
            result = l.getTitle();
//            return result;
        }
//        Map<String, String> config = new Config().getProperties();
//        result = config.get("dbUsername");
////        XueBaDataSource source = new XueBaDataSource();
//        return result;
//
        return result;

//        return day;
//        long startTime = System.nanoTime();
    }
    private String getVersion() {
        Properties prop = new Properties();
        try {
            prop.load(servletContext.getResourceAsStream("/META-INF/MANIFEST.MF"));
            version = prop.getProperty("Implementation-Version");
        } catch (Exception e) {
//            logger.error(e);
        }
        return version;
    }

}
