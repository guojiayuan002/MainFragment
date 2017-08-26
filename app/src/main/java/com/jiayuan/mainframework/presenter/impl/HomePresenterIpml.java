package com.jiayuan.mainframework.presenter.impl;

import com.jiayuan.mainframework.model.HomeModel;
import com.jiayuan.mainframework.model.impl.HomeModelIpml;
import com.jiayuan.mainframework.presenter.HomePresenter;
import com.jiayuan.mainframework.view.viewinterface.HomeFragmentView;

import java.util.List;

/**
 * Created by guojiayuan on 2017/8/22.
 */

public class HomePresenterIpml implements HomePresenter {
    private HomeFragmentView mHomeFragmentView;
    private HomeModel mHomeModel;

    public HomePresenterIpml(HomeFragmentView homeFragmentView) {
        mHomeFragmentView = homeFragmentView;
        mHomeModel = new HomeModelIpml();
    }


    public void requestBanner() {
        mHomeModel.requestBanner(this);
    }

    @Override
    public void requestBannerBack(List<String> images, List<String> links) {
        mHomeFragmentView.showBanner(images, links);
    }
}
