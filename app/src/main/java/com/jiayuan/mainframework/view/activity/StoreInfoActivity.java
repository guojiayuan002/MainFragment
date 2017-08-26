package com.jiayuan.mainframework.view.activity;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.jiayuan.mainframework.R;
import com.jiayuan.mainframework.adapter.BaseViewPagerAdapter;
import com.jiayuan.mainframework.adapter.MessageRVAdapter;
import com.jiayuan.mainframework.base.BaseActivity;
import com.jiayuan.mainframework.view.fragment.OperatorsFragment;
import com.jiayuan.mainframework.view.fragment.UseCasesFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by guojiayuan on 2017/8/24.
 */
public class StoreInfoActivity extends BaseActivity implements AppBarLayout.OnOffsetChangedListener {


    @BindView(R.id.home_toolbar)
    Toolbar mToolbar;
    @BindView(R.id.home_tabLayout)
    TabLayout mTabLayout;
    @BindView(R.id.home_viewPager)
    ViewPager mViewPager;

    @BindView(R.id.home_appbar)
    AppBarLayout mAppBarLayout;
    @BindView(R.id.iv_btn_back)
    ImageView mIvBtnBack;
    @BindView(R.id.rl_resarch_bg)
    RelativeLayout mBgRearch;
    @BindView(R.id.iv_btn_search2)
    ImageView mIvBtnSearch;
    @BindView(R.id.iv_btn_card2)
    ImageView mIvBtnCard;
    @BindView(R.id.iv_btn_more_popwindow2)
    ImageView mIvBtnPopup;


    private MessageRVAdapter mAdapter;
    private List<String> mDataList = new ArrayList<>();

    @Override
    protected int getResView() {
        //设置状态栏透明，（开始不透明，滑动后透明）
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        return R.layout.activity_store_info;
    }

    @Override
    protected void initData() {
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) { // 4.4 以上版本
//            // 设置 Toolbar 高度为 80dp，适配状态栏
//            ViewGroup.LayoutParams layoutParams = mToolbarTitle.getLayoutParams();
////            layoutParams.height = ScreenUtil.dip2px(this,ScreenUtil.getStatusBarHeight(this));
//            layoutParams.height = ScreenUtil.dip2px(this,80);
//            mToolbarTitle.setLayoutParams(layoutParams);
//        }
        initToolBar(mToolbar, false, "");
        String[] titles = {"综合", "详情"};
        BaseViewPagerAdapter pagerAdapter = new BaseViewPagerAdapter(getSupportFragmentManager(), titles);
        pagerAdapter.addFragment(new OperatorsFragment());
        pagerAdapter.addFragment(new UseCasesFragment());
        mViewPager.setAdapter(pagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
        mAppBarLayout.addOnOffsetChangedListener(this);
    }

    /**
     * 初始化 Toolbar
     */
    public void initToolBar(Toolbar toolbar, boolean homeAsUpEnabled, String title) {
        toolbar.setTitle(title);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(homeAsUpEnabled);
    }

    @Override
    public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
        System.out.println("现在的垂直变化量====" + verticalOffset);
        if (verticalOffset < -180) {
            mIvBtnBack.setImageResource(R.mipmap.nav_return_gray);
            mBgRearch.setBackgroundResource(R.drawable.home_search_background_gray);
            mIvBtnSearch.setImageResource(R.mipmap.nav_icon_search_gray);
            mIvBtnCard.setImageResource(R.mipmap.nav_shop_gray);
            mIvBtnPopup.setImageResource(R.mipmap.nav_more_gray);
        } else {
            mIvBtnBack.setImageResource(R.mipmap.nav_return_white);
            mBgRearch.setBackgroundResource(R.drawable.home_search_background_white);
            mIvBtnSearch.setImageResource(R.mipmap.nav_icon_search_white);
            mIvBtnCard.setImageResource(R.mipmap.nav_shop_white);
            mIvBtnPopup.setImageResource(R.mipmap.nav_more_white);
        }
    }
}
