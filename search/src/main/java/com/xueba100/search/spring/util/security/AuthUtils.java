package com.xueba100.search.spring.util.security;

import org.springframework.stereotype.Component;

@Component
public class AuthUtils {

    static {
        init();
    }

    public static void init() {

    }

    public static int checkAuth() {
        return 1024;
    }

    public static String setAuthFile() {
        String relativelyPath = Thread.currentThread().getContextClassLoader()
                .getResource("").getPath();

        return relativelyPath;
    }
}
