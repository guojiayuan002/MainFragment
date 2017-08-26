package com.jiayuan.mainframework.model.impl;

import com.jiayuan.mainframework.bean.BannerBean;
import com.jiayuan.mainframework.model.HomeModel;
import com.jiayuan.mainframework.network.Api;
import com.jiayuan.mainframework.network.Constance;
import com.jiayuan.mainframework.network.CookieRetrofit;
import com.jiayuan.mainframework.presenter.HomePresenter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by guojiayuan on 2017/8/22.
 */

public class HomeModelIpml implements HomeModel {

    private final Api mApi;

    public HomeModelIpml() {
        mApi = CookieRetrofit.getInstance().getApi();
    }

    @Override
    public void requestBanner(final HomePresenter homePresenter) {
        Call<BannerBean> banner = mApi.getBanner();
        banner.enqueue(new Callback<BannerBean>() {
            @Override
            public void onResponse(Call<BannerBean> call, Response<BannerBean> response) {

                BannerBean bannerBean = response.body();

                String code = bannerBean.getErrorCode();

                if (Constance.SUCCESS.equals(code)) {
                    List<BannerBean.DataBean.ResultListBean> list = bannerBean.getData().getResultList();
                    List<String> images = new ArrayList<String>();
                    List<String> links = new ArrayList<String>();
                    for (BannerBean.DataBean.ResultListBean bean : list) {
                        images.add(bean.getImgUrl());
                        links.add(bean.getLink());
                    }

                    homePresenter.requestBannerBack(images, links);
                    System.out.println("==== 轮播图成功");
                } else if (Constance.FAIL.equals(code)) {
                    System.out.println("轮播图失败0");
                } else {
                    System.out.println("错误！轮播图状态码为code ==== " + code);
                }

            }

            @Override
            public void onFailure(Call<BannerBean> call, Throwable t) {
                System.out.println("轮播图失败" + t.getLocalizedMessage());
            }
        });
    }
}
