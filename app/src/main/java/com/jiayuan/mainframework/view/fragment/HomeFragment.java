package com.jiayuan.mainframework.view.fragment;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.jiayuan.mainframework.R;
import com.jiayuan.mainframework.adapter.HomeRVAdapter;
import com.jiayuan.mainframework.base.BaseFragment;
import com.jiayuan.mainframework.presenter.impl.HomePresenterIpml;
import com.jiayuan.mainframework.utils.ToastUtils;
import com.jiayuan.mainframework.view.viewinterface.HomeFragmentView;

import java.util.ArrayList;
import java.util.List;

import butterknife.OnClick;

/**
 * Created by guojiayuan on 2017/8/22.
 */
public class HomeFragment extends BaseFragment implements SwipeRefreshLayout.OnRefreshListener, HomeFragmentView {

    private RecyclerView mRecycleView;
    private List<String> list = new ArrayList<>();
    private HomeRVAdapter mHomeRVAdapter;
    private SwipeRefreshLayout mSwipeRefreshLayout;
    private HomePresenterIpml mHomePresenter;

    @Override
    public void startloadData() {
        mHomePresenter = new HomePresenterIpml(this);
        mHomePresenter.requestBanner();
    }

    @Override
    public View onCreateContentView() {
        View view = View.inflate(mContext, R.layout.fragent_home, null);
        mRecycleView = (RecyclerView) view.findViewById(R.id.rv_recycleView);
        mSwipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.refresh_layout);
        initData();
        return view;
    }

    private void initData() {
        mSwipeRefreshLayout.setColorSchemeResources(R.color.font_red_color);
        mSwipeRefreshLayout.setOnRefreshListener(this);
        for (int i = 0; i < 100; i++) {
            list.add("我是条目" + i);
        }

        mRecycleView.setHasFixedSize(true);
        GridLayoutManager layoutManager = new GridLayoutManager(mContext, 300);//300
        mRecycleView.setLayoutManager(layoutManager);

        layoutManager.setSpanSizeLookup(mHomeRVAdapter.getSpanSizeLookup());
        mRecycleView.setAdapter(mHomeRVAdapter);

    }

    View.OnClickListener mOnAdapterClickListener = new View.OnClickListener() {
        @Override
        @OnClick({R.id.home_btn_scan2x, R.id.home_btn_promo_code2x, R.id.home_btn_announcement2x, R.id.home_btn_all2x})
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.home_btn_scan2x://扫一扫
                    ToastUtils.showToast(mContext, "点击了扫一扫");
                    break;
                case R.id.home_btn_promo_code2x://推广码
                    ToastUtils.showToast(mContext, "点击了推广码");
                    break;
                case R.id.home_btn_announcement2x:
                    ToastUtils.showToast(mContext, "点击了公告");
                    break;
                case R.id.home_btn_all2x:
                    ToastUtils.showToast(mContext, "点击了全部");
                    break;
            }
        }
    };

    //下拉刷新
    @Override
    public void onRefresh() {
        mSwipeRefreshLayout.setRefreshing(false);//隐藏掉
    }

    @Override
    public void showBanner(List<String> images, List<String> links) {
        mHomeRVAdapter = new HomeRVAdapter(mContext, list, mOnAdapterClickListener);
        mHomeRVAdapter.setBannerData(images, links);

        onLoadDataSuccess();
    }

    @Override
    public void showForm() {

    }
}
