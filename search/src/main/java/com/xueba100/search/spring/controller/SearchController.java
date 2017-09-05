package com.xueba100.search.spring.controller;

import com.xueba100.search.spring.util.security.AuthUtils;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import java.io.IOException;



@RestController
public class SearchController implements ServletContextAware {
    private ServletContext servletContext;

    @Autowired
    private AuthUtils authUtils;


    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
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
            HttpServletRequest request
    ) throws IOException
    {
        String result = "";

        // ids is empty
        if( ids.matches("^\\s*$") ) {
            return result;
        }

//        long startTime = System.nanoTime();
        return ""+authUtils.setAuthFile();
    }

}
