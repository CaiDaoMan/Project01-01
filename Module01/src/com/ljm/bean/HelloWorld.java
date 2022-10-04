package com.ljm.bean;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("hello world!!!!!!");
        System.out.println(test2());


        System.out.println(test2());
    }
    public void test(){

    }
    //这是单行注释
    /*这是多行注释*/
    public static StringBuffer test2(){
String str=null;

        str="asdasdasdasd";
StringBuffer sb=new StringBuffer();
sb=sb.append(str);
return sb;
    }
}
