package com.jiayuan.mainframework.utils;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;


/**
 * Created by guojiayuan on 2017/6/2.
 */

public class ToastUtils {
    public static void showToast(Context context, final String msg) {
        if ("main".equals(Thread.currentThread().getName())) {
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
        } else {
            Log.d("ToastUtils", "不再主线程");
        }
    }

}
