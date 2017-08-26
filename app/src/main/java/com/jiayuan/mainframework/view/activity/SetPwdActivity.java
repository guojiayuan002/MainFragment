package com.jiayuan.mainframework.view.activity;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.jiayuan.mainframework.R;
import com.jiayuan.mainframework.base.BaseActivity;
import com.jiayuan.mainframework.bean.RegistBean;
import com.jiayuan.mainframework.bean.ValidationBean;
import com.jiayuan.mainframework.network.Api;
import com.jiayuan.mainframework.network.CookieRetrofit;
import com.jiayuan.mainframework.network.LoginRetrofit;
import com.jiayuan.mainframework.utils.RSAEncrypt;
import com.jiayuan.mainframework.utils.SPUtils;
import com.jiayuan.mainframework.utils.ToastUtils;

import butterknife.BindView;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Administrator on 2017/6/2.
 */

public class SetPwdActivity extends BaseActivity implements TextWatcher {
    @BindView(R.id.SMSValidation)
    EditText mSMSValidation;
    @BindView(R.id.getValidation)
    TextView mGetValidation;
    @BindView(R.id.setPwd)
    EditText mSetPwd;
    @BindView(R.id.cloudAgreement)
    Button mCloudAgreement;
    @BindView(R.id.btn_regist)
    Button mBtnRegist;
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.imagebutton)
    ImageButton mImagebutton;

    @BindView(R.id.pwd_visible)
    ImageButton mPwdVisible;

    private String mSMS;
    private String mPwd;
    private boolean isAgree = true;//是否同意协议
    private boolean isCanRegist = false;//是否可以注册
    private boolean isVisible = true;//密码状态是否可见
    private String mPhone;
    private String mLocalValidation;
    private Api mApiCookie;
    private Api mApiLogin;

    private String RSAPwd = null;

    private String RSAUserName = null;

    @Override
    protected int getResView() {
        return R.layout.activity_setpwd;
    }

    @Override
    protected void initData() {
        mPhone = getIntent().getStringExtra("phone");
        mSMSValidation.addTextChangedListener(this);
        mSetPwd.addTextChangedListener(this);
        mApiCookie = CookieRetrofit.getInstance().getApi();
        mApiLogin = LoginRetrofit.getInstance().getApi();
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

    @OnClick({R.id.getValidation, R.id.cloudAgreement, R.id.btn_regist, R.id.imagebutton, R.id.pwd_visible})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.getValidation:

                // TODO 点击获取验证码 网络请求 60秒以后
                new Thread(new CutdownTask()) {
                }.start();
                //点击获取验证码，然后加密电话

                netWorkGetValidation();


                break;
            case R.id.cloudAgreement:
                //  点击云消费协议 跳转到一个activity
//                Intent intent = new Intent(mContext, AgreeActivity.class);
//                startActivity(intent);
                break;
            case R.id.btn_regist:
                //TODO 点击注册 网络
                regist();
                break;
            case R.id.pwd_visible:
                //切换密码状态
                updatePwdState();
                break;
            case R.id.imagebutton:
                //  点击同意协议图标，
                isAgree = !isAgree;
                if (isAgree) {
                    // mImagebutton.setBackgroundResource(R.mipmap.setup_rb_agree3x);
                    //验证码和密码符合基本条件 且 同意协议
                    if (isCanRegist) {
                        mBtnRegist.setBackgroundResource(R.mipmap.login_btn_pre3x);
                    } else {
                        mBtnRegist.setBackgroundResource(R.mipmap.login_btn3x);
                    }
                } else {
                    //不同意协议，背景设置灰色
                    // mImagebutton.setBackgroundResource(R.mipmap.setup_rb_disagree3x);
                    mBtnRegist.setBackgroundResource(R.mipmap.login_btn3x);
                }

                break;
        }
    }


    private void netWorkGetValidation() {
        String RSAPhone = null;
        try {
            RSAPhone = RSAEncrypt.encrypt(RSAEncrypt.DEFAULT_PUBLIC_KEY, mPhone);
        } catch (Exception e) {
            e.printStackTrace();
            // ShowLog.d("SetPwdActivity", "加密异常");
        }

        //获取验证码的网络请求,保存当前的cookie
        Call<ValidationBean> Validation = mApiCookie.getValidation(RSAPhone);
        Validation.enqueue(new Callback<ValidationBean>() {
            @Override
            public void onResponse(Call<ValidationBean> call, Response<ValidationBean> response) {

                ValidationBean responseInfo = response.body();
                String code = responseInfo.getErrorCode() + "";
                //ToastUtils.showToast(mContext, "获取验证码成功"+code);
                String cookie = SPUtils.getString(mContext, "Set-Cookie", "cookie");
                System.out.println("保存的cookie =" + cookie);
                if ("0".equals(code)) {
                    //parserJson(json);
                    //System.out.println("获取验证码成功" + "返回码==" + code);
                    ToastUtils.showToast(mContext, "获取验证码成功");

                } else if ("1".equals(code)) {
                    //-1表示空数据
                    // ToastUtils.showToast(mContext, "获取验证码失败1");
                } else if ("2".equals(code)) {
                    //-2表示服务器500错误
                    // ToastUtils.showToast(mContext, "获取验证码失败2");
                } else if ("22".equals(code)) {
                    //22 一小时不能获取超过3次
                    ToastUtils.showToast(mContext, "获取验证码失败，一小时不能获取超过3次");
                }

            }

            @Override
            public void onFailure(Call<ValidationBean> call, Throwable t) {
                //  ShowLog.d("SetPwdActivity", "错误信息" + t.getLocalizedMessage());
                ToastUtils.showToast(mContext, "网络错误3");
            }
        });
    }

    //登录 先过去验证码，再判断密码是否合法，再进行加密
    private void regist() {

        //密码为空
        if (TextUtils.isEmpty(mPwd)) {
            ToastUtils.showToast(this, "密码不能为空");
            return;
        }
        try {
            //对密码RSA加密
            RSAPwd = RSAEncrypt.encrypt(LoginActivity.DEFAULT_PUBLIC_KEY, mPwd);
            //对用户名（电话）RSA加密
            RSAUserName = RSAEncrypt.encrypt(LoginActivity.DEFAULT_PUBLIC_KEY, mPhone);
        } catch (Exception e) {
            e.printStackTrace();
            // ShowLog.d("LoginActivity", "==用户名或密码加密失败");

        }


        //用户名(手机号)、密码加密。验证码

        //TODO 网络请求
        Call<RegistBean> regist = mApiLogin.regist(RSAUserName, RSAPwd, mSMS);
        regist.enqueue(new Callback<RegistBean>() {
            @Override
            public void onResponse(Call<RegistBean> call, Response<RegistBean> response) {
                RegistBean responseInfo = response.body();
                String code = responseInfo.getErrorCode();
                //ToastUtils.showToast(mContext, "注册成功");
                if ("1".equals(code)) {

                    System.out.println("注册成功" + "返回码==" + code);
                    ToastUtils.showToast(mContext, "注册成功");
                    //sp保存用户加密手机号
                    //SPUtils.putString(mContext,"UserRSAPhone",RSAUserName);
                    SetPwdActivity.this.finish();//关闭当前界面

                } else if ("0".equals(code)) {
                    //-1表示空数据
                    ToastUtils.showToast(mContext, "注册失败");
                } else if ("501004".equals(code)) {
                    //-1表示空数据
                    ToastUtils.showToast(mContext, "注册失败，手机验证码错误");
                } else if ("501001".equals(code)) {
                    //-1表示空数据
                    ToastUtils.showToast(mContext, "注册失败，用户已注册");
                }

            }

            @Override
            public void onFailure(Call<RegistBean> call, Throwable t) {
                //  ShowLog.d("SetPwdActivity", "错误信息=" + t.getLocalizedMessage());
                ToastUtils.showToast(mContext, "注册失败");
            }
        });
    }


    private void updatePwdState() {
        isVisible = !isVisible;
        if (isVisible) {
            //如果选中，显示密码
            // mPwdVisible.setImageResource(R.mipmap.no_visible3x);//闭
            mSetPwd.setTransformationMethod(HideReturnsTransformationMethod.getInstance());

        } else {
            //否则隐藏密码
            // mPwdVisible.setImageResource(R.mipmap.visible3x);//眼睛
            mSetPwd.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }


    }


    /***
     * EditText 添加监听
     */
    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        //不选中协议，背景永远是灰色
        if (isAgree == false) {
            mBtnRegist.setBackgroundResource(R.mipmap.login_btn3x);
            return;
        }
        mSMS = mSMSValidation.getText().toString().trim();
        mPwd = mSetPwd.getText().toString().trim();
        int length = mPwd.length();
        //对密码判断为空或长度小于6，大于20
        if (TextUtils.isEmpty(mPwd) || length < 6 || length > 20) {
            isCanRegist = false;
            mBtnRegist.setBackgroundResource(R.mipmap.login_btn3x);
            return;
        }

        if (mSMS.length() == 4) {
            isCanRegist = true;
            mBtnRegist.setBackgroundResource(R.mipmap.login_btn_pre3x);
        } else {
            if (isCanRegist) {
                isCanRegist = false;
                mBtnRegist.setBackgroundResource(R.mipmap.login_btn3x);
            }
        }
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }


    @Override
    public void afterTextChanged(Editable s) {

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                //点击ToolBar返回按钮
                finish();
                break;
        }
        return true;
    }


    /**
     * 找回密码
     */
    private class CutdownTask implements Runnable {

        @Override
        public void run() {
            for (; time > 0; time--) {
                try {
                    Thread.sleep(999);
                    mHandler.sendEmptyMessage(TIME_ING);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            mHandler.sendEmptyMessage(TIME_OUT);
        }
    }

    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case TIME_ING:
                    mGetValidation.setText("剩余时间(" + time + ")秒");
                    break;
                case TIME_OUT:
                    mGetValidation.setEnabled(true);
                    mGetValidation.setText("重新发送");
                    time = 60;
                    break;
            }
        }
    };

}
