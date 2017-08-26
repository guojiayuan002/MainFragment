package com.jiayuan.mainframework.network.persistentcookiejar.interceptors;

import android.content.Context;
import com.jiayuan.mainframework.network.Constance;
import com.jiayuan.mainframework.utils.SPUtils;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * This Interceptor add all received Cookies to the app DefaultPreferences.
 * Your implementation on how to save the Cookies on the Preferences MAY VARY.
 * 保存
 * <p>
 * Created by guojiayuan on 17/8/14.
 */
public class SaveCookiesInterceptor implements Interceptor {
    private Context mContext;

    public SaveCookiesInterceptor(Context context) {
        mContext = context;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Response originalResponse = chain.proceed(request);
        String cookie = originalResponse.header(Constance.COOKIE);

        if (!originalResponse.headers(Constance.COOKIE).isEmpty()) {
//            HashSet<String> cookies = new HashSet<>();
//            List<String> headers = originalResponse.headers("Set-Cookie");
//
//            for (String header : originalResponse.headers("Set-Cookie")) {
//              cookies.add(header);
//            }

            SPUtils.putString(mContext, Constance.COOKIE, cookie);
//            Preferences.getDefaultPreferences().edit()
//                    .putStringSet(Preferences.PREF_COOKIES, cookies)
//                    .apply();

        }

        return originalResponse;
    }
}