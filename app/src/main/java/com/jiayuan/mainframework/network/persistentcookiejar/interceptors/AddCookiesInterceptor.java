package com.jiayuan.mainframework.network.persistentcookiejar.interceptors;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class AddCookiesInterceptor implements Interceptor {
    private String mCookie;

    public AddCookiesInterceptor(String cookie) {
        mCookie = cookie;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {

        //Request.Builder builder = chain.request().newBuilder();
       // HashSet<String> preferences = (HashSet) Preferences.getDefaultPreferences().getStringSet(Preferences.PREF_COOKIES, new HashSet<>());
//        for (String cookie : preferences) {
//            builder.addHeader("Cookie", cookie);
//            Log.v("OkHttp", "Adding Header: " + cookie); // This is done so I know which headers are being added; this interceptor is used after the normal logging of OkHttp
//        }
        Request request = chain.request();
        Response originalResponse = chain.proceed(request);
        CacheControl.Builder builder = new CacheControl.Builder().maxAge(10, TimeUnit.MINUTES);

        return originalResponse.newBuilder()
                .header("Cache-Control", builder.build().toString())
                .addHeader("cookie", mCookie)
                .build();
    }
}