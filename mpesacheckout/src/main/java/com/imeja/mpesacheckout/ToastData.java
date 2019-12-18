package com.imeja.mpesacheckout;

import android.util.Log;

public class ToastData {

    private static final String TAG = "ToastData";

    public static void d(String message) {
        Log.d(TAG, message);
    }

    public static void e(String message) {
        Log.e(TAG, message);
    }

    public static void w(String message) {
        Log.w(TAG, message);
    }

    public static void i(String message) {
        Log.i(TAG, message);
    }

    public static void v(String message) {
        Log.v(TAG, message);
    }

}
