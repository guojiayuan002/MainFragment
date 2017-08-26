package com.jiayuan.mainframework.network;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jiayuan.mainframework.network.persistentcookiejar.PersistentCookieJar;
import com.jiayuan.mainframework.network.persistentcookiejar.cache.SetCookieCache;
import com.jiayuan.mainframework.network.persistentcookiejar.interceptors.AddCookiesInterceptor;
import com.jiayuan.mainframework.network.persistentcookiejar.interceptors.LoggingInterceptor;
import com.jiayuan.mainframework.network.persistentcookiejar.persistence.SharedPrefsCookiePersistor;
import com.jiayuan.mainframework.utils.SPUtils;

import java.io.File;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

import static com.jiayuan.mainframework.network.Constance.DEFAULT_CACHE_SIZE;

/**
 * Created by Administrator on 2017/6/1.
 */

public class CookieRetrofit {
    private static CookieRetrofit sJiaYuanRetrofit;
    private Api mApi;
    private Gson mGson = new GsonBuilder().setLenient().create();//设置宽大处理畸形的json

    public void init(Context context) {
        String cookie = SPUtils.getString(context, Constance.COOKIE, "cookie");
        PersistentCookieJar cookieJar = new PersistentCookieJar(new SetCookieCache(),new SharedPrefsCookiePersistor(context));
        String directoryPath = context.getCacheDir().getAbsolutePath() + "/responses";
        File directory = new File(directoryPath);

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .cache(new Cache(directory, DEFAULT_CACHE_SIZE))
                .addInterceptor(new LoggingInterceptor())

                .addNetworkInterceptor(new AddCookiesInterceptor(cookie))
                .cookieJar(cookieJar)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constance.BASE_HOST)
                .client(okHttpClient)

                .addConverterFactory(GsonConverterFactory.create(mGson))
                .addConverterFactory(ScalarsConverterFactory.create())
                .build();
        mApi = retrofit.create(Api.class);
    }


    public static CookieRetrofit getInstance() {

        if (sJiaYuanRetrofit == null) {
            synchronized (CookieRetrofit.class) {
                if (sJiaYuanRetrofit == null) {
                    sJiaYuanRetrofit = new CookieRetrofit();
                }
            }
        }

        return sJiaYuanRetrofit;
    }

    public Api getApi() {
        return mApi;
    }
}
