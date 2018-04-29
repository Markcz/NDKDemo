package com.mark.ndkdemo;

/**
 * Created by mark on 17-11-12.
 */

public class JNI {

    {
        System.loadLibrary("Hello");
    }

    public native String sayHello();

    public native String hello();

}
