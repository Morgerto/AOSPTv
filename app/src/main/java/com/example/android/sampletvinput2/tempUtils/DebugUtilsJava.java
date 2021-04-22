package com.example.android.sampletvinput2.tempUtils;

public class DebugUtilsJava {

    public  static <T extends Object> String getClassName(T obj){
        return obj.getClass().getSimpleName();
    }
}
