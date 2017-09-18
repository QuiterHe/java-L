package com.xueba100.search.spring.util;

import org.apache.commons.lang.StringUtils;

import java.util.*;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Common {



    public static boolean isNotEmpty(Map map) {
        return null != map && map.size() > 0;
    }

    public static boolean isNotEmpty(List list) {
        return null != list && list.size() > 0;
    }

    public static boolean isNotEmpty(Object[] arr) {
        return null != arr && arr.length > 0;
    }

    public static boolean isNotEmpty(Set set) {
        return null != set && set.size() > 0;
    }

    public static boolean isNotEmpty(String str) {
        return StringUtils.isNotEmpty(str);
    }
}
