package com.jiayuan.mainframework.view.fragment;

import android.view.View;

import com.jiayuan.mainframework.R;
import com.jiayuan.mainframework.base.BaseFragment;

import butterknife.ButterKnife;

/**
 * Created by guojiayuan on 2017/8/22.
 */
public class ShoppingCartFragment extends BaseFragment{
    @Override
    public void startloadData() {
        onLoadDataSuccess();
    }

    @Override
    public View onCreateContentView() {
        View view = View.inflate(mContext, R.layout.fragment_shopping_cart, null);
        ButterKnife.bind(this, view);

        return view;
    }
}
