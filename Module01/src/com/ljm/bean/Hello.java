package com.ljm.bean;

import java.util.ArrayList;

/**
 * @author liujinman
 * @create 2022-10-03 15:03
 */
public class Hello {
    public static String str="asd";
    private static final String str2 ="dasd";

    public static void main(String[] args) {
        System.out.println(str);
        System.out.println("HelloWorld");
        String[] strs =new String[]{"asda","asd","sdddddd"};
        ArrayList list =new ArrayList();
        ArrayList list2 =new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        list2=null;


    }

    public static void test(int i,String str)
    {
        int p=120;
        System.out.println("p = " + p);
        String ss="5689778945656564456";
        System.out.println("i = [" + i + "], str = [" + str + "]");
        System.out.println("Hello.test");
        System.out.println("ss = " + ss);
    }

}
