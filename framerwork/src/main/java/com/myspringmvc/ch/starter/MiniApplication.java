package com.myspringmvc.ch.starter;

public class MiniApplication{
    /**
     * 作为框架的入口类，一般传参为应用的入口类，通过应用的入口类，我们就可以定位到项目到根目录，也就能获取到应用入口类的信息
     * 后面的参数数据就是应用入口类的参数数组
     * @param cls 一个类
     * @param args 参数数组
     */
    public static void run(Class<?> cls, String... args){
        System.out.println("Hello miniSpring");

    }
}
