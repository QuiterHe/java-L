package com.xueba100.search.core;

import com.xueba100.search.spring.util.Common;
import com.xueba100.search.spring.util.CommonIO;
import com.xueba100.search.spring.util.CommonString;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Config {

    public Config() {

    }

    public Map<String, String> getProperties() {
        String relativelyPath = Thread.currentThread().getContextClassLoader()
                .getResource("").getPath();
        relativelyPath = CommonString.replaceRegex(relativelyPath,
                "[^/]*/WEB-INF/.*$", "");

        relativelyPath = relativelyPath + "conf/database.conf";
        List<String> configs = CommonIO.readLines(relativelyPath, "utf-8");

        Map<String, String> result = new HashMap<String, String>();
        for (String c : configs ) {
            if(Common.isNotEmpty(c) && !CommonString.matches(c, "^\\s*\\#")) {
                result.put(c.substring(0, c.indexOf(":")).trim(),
                        c.substring(c.indexOf(":")+1).trim());
            }
        }

        return result;
    }

}
