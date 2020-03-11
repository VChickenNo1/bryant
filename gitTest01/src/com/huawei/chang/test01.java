package com.huawei.chang;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by Administrator on 2020/3/11
 */
public class test01 {
    public static void main(String[] args) {
        System.out.println("hello,world!");
        System.out.println(method01());
    }

    private static String method01() {
        Map<String, String> map = new HashMap<>();
        map.put("zhangsan", "nan");
        map.put("lisi", "nv");
        map.put("wangwu", "nan");
        return map.toString();

    }
}
