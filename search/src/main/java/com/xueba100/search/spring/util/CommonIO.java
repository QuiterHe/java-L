package com.xueba100.search.spring.util;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class CommonIO {

    public static List<String> readLines(String filename, String encode) {
        List< String > result = new LinkedList<String>();
        try{
            result = FileUtils.readLines(new File(filename), encode);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

}
