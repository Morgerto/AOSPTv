package com.example.android.sampletvinput.tempUtils

class DebugHelpUtils {
    companion object{
        fun <T : Any> getClassName(obj : T): String? {
            return obj!!::class.java.simpleName
        }
    }
}