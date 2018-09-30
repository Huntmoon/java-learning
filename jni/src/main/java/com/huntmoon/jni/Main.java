package com.huntmoon.jni;

/**
 * @author wangtao
 * @since 2018/9/30
 */
public class Main {
    public static void main(String[] args) {
//        Jni jni = new Jni();
//        jni.sayHello();
        System.out.print(System.getProperty("java.library.path"));
    }
}
