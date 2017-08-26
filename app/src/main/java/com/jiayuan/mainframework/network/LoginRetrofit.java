package com.jiayuan.mainframework.network;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jiayuan.mainframework.network.persistentcookiejar.interceptors.LoggingInterceptor;
import com.jiayuan.mainframework.network.persistentcookiejar.interceptors.SaveCookiesInterceptor;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;


/**
 * Created by guojiayuan on 2017/4/6.
 * 登录时候保存cookie 不用做缓存
 */
public class LoginRetrofit {

    private static LoginRetrofit sYunRetrofit;

    private Api mApi;

    private static Gson gson = new GsonBuilder()
            .setLenient()
            .create();


    public static LoginRetrofit getInstance() {
        if (sYunRetrofit == null) {
            synchronized (LoginRetrofit.class) {
                if (sYunRetrofit == null) {
                    sYunRetrofit = new LoginRetrofit();
                }
            }
        }
        return sYunRetrofit;
    }

    public Api getApi() {
        return mApi;
    }

    public void init(Context context) {

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new LoggingInterceptor())
                //获取cookie,保存起来，全局唯一
                .addNetworkInterceptor(new SaveCookiesInterceptor(context))
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constance.BASE_HOST)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addConverterFactory(ScalarsConverterFactory.create())
                .build();
        mApi = retrofit.create(Api.class);
    }


}
