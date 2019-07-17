package com.myspringmvc.ch;

import com.myspringmvc.ch.starter.MiniApplication;

public class Application {

    public static void main(String[] args) {
        System.out.println("Hello World");
        MiniApplication.run(Application.class, args);

    }
}
