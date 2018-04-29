//
// Created by mark on 17-11-12.
//

#include <stdio.h>
#include <stdlib.h>
#include <jni.h>

jstring Java_com_mark_ndkdemo_JNI_sayHello(JNIEnv* env,jobject jobj){
    char* text = "I am from CString.";
    return (*env) -> NewStringUTF(env,text);
}

JNIEXPORT jstring JNICALL
Java_com_mark_ndkdemo_JNI_hello(JNIEnv *env, jobject instance) {

    // TODO
    char * text = "个哦哦";

    return (*env)->NewStringUTF(env, text);
}