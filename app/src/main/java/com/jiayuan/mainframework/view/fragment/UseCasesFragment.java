package com.jiayuan.mainframework.view.fragment;

import android.view.View;

import com.jiayuan.mainframework.R;
import com.jiayuan.mainframework.base.BaseFragment;

/**
 * Created by guojiayuan on 2017/8/24.
 */
public class UseCasesFragment extends BaseFragment {
    @Override
    public void startloadData() {
        onLoadDataSuccess();
    }

    @Override
    public View onCreateContentView() {
        return View.inflate(mContext, R.layout.fragment_test2,null);
    }
}
