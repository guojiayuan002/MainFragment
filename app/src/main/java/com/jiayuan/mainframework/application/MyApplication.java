package com.jiayuan.mainframework.application;

import android.app.Application;

import com.jiayuan.mainframework.base.BaseActivity;
import com.jiayuan.mainframework.network.CookieRetrofit;
import com.jiayuan.mainframework.network.LoginRetrofit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guojiayuan on 2017/8/22.
 */

public class MyApplication extends Application {
    private List<BaseActivity> mBaseActivityList = new ArrayList<>();

    @Override
    public void onCreate() {
        super.onCreate();

        //initHuanXin();
        LoginRetrofit.getInstance().init(getApplicationContext());
        CookieRetrofit.getInstance().init(getApplicationContext());

    }


    //mApplication = (QQApplication) getApplication();
//    mApplication.addActivity(this);
    public void addActivity(BaseActivity activity){
        if (!mBaseActivityList.contains(activity)){
            mBaseActivityList.add(activity);
        }
    }
    public void removeActivity(BaseActivity activity){
        mBaseActivityList.remove(activity);
    }
}
