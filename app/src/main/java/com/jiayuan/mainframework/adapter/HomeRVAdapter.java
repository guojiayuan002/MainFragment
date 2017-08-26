package com.jiayuan.mainframework.adapter;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jiayuan.mainframework.R;
import com.jiayuan.mainframework.utils.ToastUtils;
import com.youth.banner.Banner;
import com.youth.banner.listener.OnBannerListener;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by guojiayuan on 2017/8/22.
 */
public class HomeRVAdapter extends RecyclerView.Adapter {

    public static final int TYPE_BANNER = 0;  //轮播图
    public static final int TYPE_NAVIGATION = 1;

    public static final int TYPE_FORM = 2;  //表图


    private List<String> mDataList;
    private List<String> mBannerImages;
    private List<String> mBannerLinks;
    private Context mContext;
    private View.OnClickListener mOnAdapterClickListener;
    private final SpanSizeLookup spanSizeLookup = new SpanSizeLookup();

    public HomeRVAdapter(Context context, List<String> list, View.OnClickListener listener) {
        mContext = context;
        mDataList = list;
        mOnAdapterClickListener = listener;
        notifyDataSetChanged();
    }

    public void setBannerData(List<String> images, List<String> links) {
        mBannerImages = images;
        mBannerLinks = links;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView;
        switch (viewType) {
            case TYPE_BANNER:
                itemView = View.inflate(mContext, R.layout.item_home_banner, null);
                BannerViewHolder bannerViewHolder = new BannerViewHolder(itemView);
                return bannerViewHolder;
            case TYPE_NAVIGATION://导航
                itemView = View.inflate(mContext, R.layout.item_home_navigation, null);
                NavigationViewHolder navigationViewHolder = new NavigationViewHolder(itemView);
                return navigationViewHolder;
            case TYPE_FORM:
                itemView = View.inflate(mContext, R.layout.item_home_form, null);
                FormViewHolder formViewHolder = new FormViewHolder(itemView);
                return formViewHolder;
            default:
                Log.e("HomeFragment", "竟然还有第N种holder");
                return null;
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        int viewType = getItemViewType(position);
        switch (viewType) {
            case TYPE_BANNER:
                BannerViewHolder viewHolder = (BannerViewHolder) holder;
                viewHolder.setData();
                break;
            case TYPE_NAVIGATION://导航
                NavigationViewHolder navigationViewHolder = (NavigationViewHolder) holder;
                navigationViewHolder.setData();
                break;
            case TYPE_FORM:
                FormViewHolder formViewHolder = (FormViewHolder) holder;
                formViewHolder.setData();
                break;
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return TYPE_BANNER;
        } else if (position == 1) {
            return TYPE_NAVIGATION;
        } else {
            return TYPE_FORM;
        }
    }

    @Override
    public int getItemCount() {
        return mDataList == null ? 0 : mDataList.size() + 2;//多加一个轮播图和导航
    }

    public GridLayoutManager.SpanSizeLookup getSpanSizeLookup() {
        return spanSizeLookup;
    }


    private class SpanSizeLookup extends GridLayoutManager.SpanSizeLookup {
        @Override
        public int getSpanSize(int position) {
            // return list.get(position).getSpanCount();
            if (position < 3) {
                return 300;
            } else if (position >= 3 & position < 9) {
                return 150;
            } else if (position >= 9 & position < 18) {
                return 100;
            } else if (position == mDataList.size()) {//多加一个轮播图
                return 300;
            } else {
                return 60;
            }
        }
    }

    class BannerViewHolder extends RecyclerView.ViewHolder implements OnBannerListener {
        @BindView(R.id.banner)
        Banner mIvBanner;

        BannerViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);

//            //设置banner样式
//            mIvBanner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE);
//            //设置图片加载器
//            mIvBanner.setImageLoader(new GlideImageLoader());
//            //设置图片集合
//            mIvBanner.setImages(mBannerImages);
//            mIvBanner.setOnBannerListener(this);
//            //设置banner动画效果
//            mIvBanner.setBannerAnimation(Transformer.DepthPage);
//            //设置标题集合（当banner样式有显示title时）
//            //mIvBanner.setBannerTitles(titles);
//
//            //设置自动轮播，默认为true
//            //mIvBanner.isAutoPlay(true);
//            //设置轮播时间
//            mIvBanner.setDelayTime(1500);
//            //设置指示器位置（当banner模式中有指示器时）
//            mIvBanner.setIndicatorGravity(BannerConfig.CENTER);
//            //banner设置方法全部调用完毕时最后调用
//            mIvBanner.start();
            //设置图片加载器
            mIvBanner.setImageLoader(new GlideImageLoader());
            //设置图片集合
            mIvBanner.setOnBannerListener(this);

            mIvBanner.setImages(mBannerImages);
            mIvBanner.setDelayTime(3000);
            //banner设置方法全部调用完毕时最后调用
            mIvBanner.start();
        }

        public void setData() {

        }

        @Override
        public void OnBannerClick(int position) {
            ToastUtils.showToast(mContext, mBannerLinks.get(position));
        }
    }

    class NavigationViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.home_btn_scan2x)
        LinearLayout mHomeBtnScan2x;
        @BindView(R.id.home_btn_promo_code2x)
        LinearLayout mHomeBtnPromoCode2x;
        @BindView(R.id.home_btn_announcement2x)
        LinearLayout mHomeBtnAnnouncement2x;
        @BindView(R.id.home_btn_all2x)
        LinearLayout mHomeBtnAll2x;

        NavigationViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
            mHomeBtnScan2x.setOnClickListener(mOnAdapterClickListener);
            mHomeBtnPromoCode2x.setOnClickListener(mOnAdapterClickListener);
            mHomeBtnAnnouncement2x.setOnClickListener(mOnAdapterClickListener);
            mHomeBtnAll2x.setOnClickListener(mOnAdapterClickListener);
        }

        public void setData() {

        }
    }

    class FormViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_item)
        TextView mTvItem;

        FormViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        public void setData() {

        }
    }
}
