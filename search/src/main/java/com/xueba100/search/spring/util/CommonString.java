package com.xueba100.search.spring.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommonString {



    public static String replaceRegex(String str, String regex, String replace) {
        String result = str;
        try {
            Pattern pt = Pattern.compile(regex, Pattern.CASE_INSENSITIVE | Pattern.DOTALL | Pattern.COMMENTS);
            Matcher mch = pt.matcher(str);
            result = mch.replaceAll(replace);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static String replaceRegex(String str, String[] regex, String replace) {
        String result = str;
        try {
            if(null != regex && null != str) {
                for(String ele: regex) {
                    result = replaceRegex(result, ele, replace);
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     *
     * @param str 原字符串
     * @param regex 正则
     * @param replace 替换字符串
     * @return str
     */
    public static String replaceRegex(String str, String[] regex, String[] replace) {
        String result = str;
        try {
            if(null != regex && null != str) {
                for(int i=0; i< regex.length; i++) {
                    result = replaceRegex(result, regex[i], replace[i]);
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static boolean matches(String str, String regex) {
        boolean result = false;
        try {
            Pattern pt = Pattern.compile(regex, Pattern.CASE_INSENSITIVE | Pattern.DOTALL | Pattern.COMMENTS);
            Matcher mch = pt.matcher(str);
            result = mch.find();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}