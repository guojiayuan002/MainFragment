package com.jiayuan.mainframework.view.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.jiayuan.mainframework.R;
import com.jiayuan.mainframework.bean.PersonInfo;
import com.jiayuan.mainframework.network.Api;
import com.jiayuan.mainframework.network.Constance;
import com.jiayuan.mainframework.otherbase.Base2Activity;
import com.jiayuan.mainframework.presenter.LoginPresenterlpml;
import com.jiayuan.mainframework.utils.SPUtils;
import com.jiayuan.mainframework.utils.ToastUtils;
import com.jiayuan.mainframework.view.viewinterface.ILoginView;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by Administrator on 2017/6/2.
 */

public class LoginActivity extends Base2Activity<ILoginView, LoginPresenterlpml> implements TextWatcher, ILoginView {
    private static final String TAG = "LoginActivity====";
    @BindView(R.id.et_login_name)
    EditText mEtLoginName;
    @BindView(R.id.et_login_pwd)
    EditText mEtLoginPwd;
    @BindView(R.id.btn_login)
    Button mBtnLogin;
    @BindView(R.id.fast_regist)
    Button mFastRegist;
    @BindView(R.id.forgot_pwd)
    Button mForgotPwd;
    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    @BindView(R.id.pwd_visible)
    ImageButton mPwdVisible;

    public static final String DEFAULT_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDxGvtfIxwNp74qEXAkmp/86uYKcJgVQ3PZ+2i68yzIbC1PjUKTywdF4ko5tci6tgx7UVV7ZoQF6DiZiYSnBRhnGFLRlY/q7g1Xle3OqasRm0MTLemfY2QvJYuiVgZ8FicEEF08HSmoRyqTmeInAkRPG7/s2IAtAvaSNUWj54DfsQIDAQAB";


    private String mUserName;
    private String mUserPwd;
    private boolean isVisible = true;//密码状态是否可见
    private Api mApi;


    @Override
    protected int getResView() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
                    | WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
            //            window.setNavigationBarColor(Color.TRANSPARENT);
        }
        return R.layout.activity_login;
    }

    @Override
    protected void initListener() {
        mEtLoginName.addTextChangedListener(this);
        mEtLoginPwd.addTextChangedListener(this);
        initActionBar();
    }

    @Override
    protected LoginPresenterlpml createPresenter() {
        return new LoginPresenterlpml(this);
    }

    @Override
    protected void initActionBar() {
        //替换原有的ActionBar为我们自己创建的Toolbar
        setSupportActionBar(mToolbar);
        //获得替换后的ActionBar状态
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("");

        //设置显示Home按钮（默认是箭头）
        actionBar.setDisplayHomeAsUpEnabled(true);
    }


    //    , R.id.fast_regist
    @OnClick({R.id.btn_login, R.id.fast_regist, R.id.forgot_pwd, R.id.pwd_visible})
    public void onViewClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.btn_login:
                //TODO 点击登录
                showDialog("登录中...");
                mPresenter.login();
                break;
            case R.id.fast_regist:
                //TODO 点击快速注册
//                    intent = new Intent(mContext, PhoneRegistActivity.class);
//                    startActivity(intent);
                String cookie = SPUtils.getString(mContext, Constance.COOKIE, "cookie");
                System.out.println("我的cookie====" + cookie);
                break;
            case R.id.forgot_pwd:
                //TODO 点击忘记密码

                break;
            //点击切换密码状态
            case R.id.pwd_visible:
                updatePwdState();
                break;
        }
    }

    private void updatePwdState() {
        isVisible = !isVisible;
        if (isVisible) {
            //如果选中，显示密码
            //mPwdVisible.setImageResource(R.mipmap.no_visible3x);//闭眼睛
            mEtLoginPwd.setTransformationMethod(HideReturnsTransformationMethod.getInstance());

        } else {
            //否则隐藏密码
//            mPwdVisible.setImageResource(R.mipmap.visible3x);//眼睛
            mEtLoginPwd.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }


    }


    private void dealWithActivity(PersonInfo.DataBean bean) {

        //通过EventBus发送数据，哪里注册修改奶数据
        //EventBus.getDefault().post(memberInfo);
        finish();//最后关闭当前界面
    }

    //登录成功 修改UI
    public void afterLogin() {
        ToastUtils.showToast("登录成功");
    }


    /**
     * 给textview设置改变监听
     */
    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        mUserName = mEtLoginName.getText().toString().trim();
        mUserPwd = mEtLoginPwd.getText().toString().trim();
        if (mUserPwd.length() == 0 || mUserName.length() == 0) {
            mBtnLogin.setBackgroundResource(R.mipmap.login_btn3x);
            return;
        }

        if (mUserPwd.length() > 5) {
            mBtnLogin.setBackgroundResource(R.mipmap.login_btn_pre3x);
        } else {
            mBtnLogin.setBackgroundResource(R.mipmap.login_btn3x);
        }
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void afterTextChanged(Editable s) {

    }

    @Override
    public EditText getLoginName() {
        //  return mEtLoginName.getText().toString().trim();
        return mEtLoginName;
    }

    @Override
    public EditText getPwd() {
        // return mEtLoginPwd.getText().toString().trim();
        return mEtLoginPwd;
    }
}
