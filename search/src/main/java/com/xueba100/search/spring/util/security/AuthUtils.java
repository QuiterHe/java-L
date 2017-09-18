package com.xueba100.search.spring.util.security;

import org.springframework.stereotype.Component;
import com.xueba100.search.spring.util.CommonString;
import com.xueba100.search.spring.util.Common;

@Component
public class AuthUtils {

    public static String authFile;

    static {
        init();
    }

    public static void init() {
        setAuthFile();
    }

    /**
     *
     * @param user
     * @param token
     * @return 如果是0,未通过;1,只给题目;2,题目答案都给
     */
    public static int checkAuth() {
        Common.isNotEmpty(authFile);
        return 1024;
    }

    public static void setAuthFile() {
        String relativelyPath = Thread.currentThread().getContextClassLoader()
                .getResource("").getPath();
        relativelyPath = CommonString.replaceRegex(relativelyPath,
                "[^/]*/WEB-INF/.*$", "");

        relativelyPath +=  relativelyPath + "conf/auth.conf";

        authFile = relativelyPath;
    }
}
