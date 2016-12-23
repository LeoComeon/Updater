package com.simplepeng.updaterlibrary;

import android.util.Log;

/**
 * Created by simple on 16/12/19.
 */

public class LogUtils {

    private static final String TAG = "Updater";
    private static boolean isDebug = true;

    public static void debug(String msg) {
        if (isDebug) {
            Log.d(TAG, msg);
        }
    }
}