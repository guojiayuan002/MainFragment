package com.jiayuan.mainframework.view.fragment;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

import com.jiayuan.mainframework.R;
import com.jiayuan.mainframework.base.BaseFragment;
import com.jiayuan.mainframework.view.activity.LoginActivity;
import com.jiayuan.mainframework.view.activity.PhoneRegistActivity;
import com.jiayuan.mainframework.view.activity.StoreInfoActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by guojiayuan on 2017/8/22.
 */
public class MeFragment extends BaseFragment {
    @Override
    public void startloadData() {
        onLoadDataSuccess();

    }
//
//    public void regist(View view) {
//        Intent intent = new Intent(mContext, PhoneRegistActivity.class);
//        startActivity(intent);
//    }
//
//    public void login(View view) {
//        Intent intent = new Intent(mContext, LoginActivity.class);
//        startActivity(intent);
//    }

    @Override
    public View onCreateContentView() {
        View view = View.inflate(mContext, R.layout.fragent_me, null);
        ButterKnife.bind(this, view);
        return view;
    }


    @OnClick({R.id.btn_login, R.id.btn_regist,R.id.btn_go_store})
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.btn_login:
                intent = new Intent(mContext, LoginActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_regist:
                intent = new Intent(mContext, PhoneRegistActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_go_store:
                intent = new Intent(mContext, StoreInfoActivity.class);
                startActivity(intent);
                break;
        }
    }
}
