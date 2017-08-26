package com.jiayuan.mainframework.view.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.jiayuan.mainframework.R;
import com.jiayuan.mainframework.base.BaseActivity;
import com.jiayuan.mainframework.bean.LoginBean;
import com.jiayuan.mainframework.bean.PersonInfo;
import com.jiayuan.mainframework.network.Api;
import com.jiayuan.mainframework.network.Constance;
import com.jiayuan.mainframework.network.LoginRetrofit;
import com.jiayuan.mainframework.utils.CheckPwdUtils;
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

public class LoginActivity extends BaseActivity implements TextWatcher {
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

    @BindView(R.id.pb_progressBar)
    ProgressBar mProgressBar;
    @BindView(R.id.ll_login)
    LinearLayout mLlLogin;


    private String mUserName;
    private String mUserPwd;
    private boolean isVisible = true;//密码状态是否可见
    private Api mApi;
    private ProgressDialog mProgressDialog;

    @Override
    protected int getResView() {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
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
    protected void initData() {
        mProgressDialog = new ProgressDialog(this);
        mProgressDialog.setCancelable(false);
        mEtLoginName.addTextChangedListener(this);
        mEtLoginPwd.addTextChangedListener(this);
        initActionBar();
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


    @OnClick({R.id.btn_login, R.id.fast_regist, R.id.forgot_pwd, R.id.pwd_visible})
    public void onViewClicked(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.btn_login:
                //TODO 点击登录
                showDialog("登录中...");
                judgeContent();
                break;
            case R.id.fast_regist:
                //TODO 点击快速注册
                intent = new Intent(mContext, PhoneRegistActivity.class);
                startActivity(intent);
                break;
            case R.id.forgot_pwd:
                //TODO 点击忘记密码
//                intent = new Intent(mContext, BackPwdActivity.class);
//                startActivity(intent);
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

    /**
     * 判断内容 用户名和密码是否为空
     */
    private void judgeContent() {


        if (TextUtils.isEmpty(mUserName) || TextUtils.isEmpty(mUserPwd)) {
            ToastUtils.showToast(this, "用户名或密码不能为空");
            return;
        } else {
            //验证密码是否合法
            boolean ok = CheckPwdUtils.checkPwd(mUserPwd, mContext);
            if (!ok) {
                Toast.makeText(LoginActivity.this, "密码长度或格式不正确", Toast.LENGTH_SHORT).show();
                return;
            } else {
                //对密码RSA加密
                String RSAPwd = null;//密码和账号检验合格
                String RSAName = null;//密码和账号检验合格
                try {
                    RSAPwd = RSAEncrypt.encrypt(DEFAULT_PUBLIC_KEY, mUserPwd);
                    RSAName = RSAEncrypt.encrypt(DEFAULT_PUBLIC_KEY, mUserName);
                } catch (Exception e) {
                    e.printStackTrace();
                    //ShowLog.d("LoginActivity", "登录密码加密失败");

                }
                //TODO 网络请求
                mApi = LoginRetrofit.getInstance().getApi();
                System.out.println("mUserName = " + mUserName);
                Call<LoginBean> login = mApi.login(RSAName, RSAPwd);
                login.enqueue(new Callback<LoginBean>() {
                    @Override
                    public void onResponse(Call<LoginBean> call, Response<LoginBean> response) {
                        LoginBean loginBean = response.body();
                        String code = loginBean.getErrorCode();
                        mProgressDialog.hide();
                        System.out.println("请求成功" + "登录返回码====" + code);
                        if ("1".equals(code)) {
                            // TODO 用户数据处理
                            LoginBean.DataBean.MemberBean memberBean = loginBean.getData().getMember();
                            // 登录成功保存所有用户信息

                            //用户的唯一ID
                            String userId = memberBean.getId() + "";
                            //SPUtils.putString(mContext, "memberId", String.valueOf(mUserId));
                            //登录成功后，继续查询个人信息
                            ToastUtils.showToast(mContext, "登录成功");
                            //TODO 界面跳转
                            // mPbProgressBar.setVisibility(View.VISIBLE);//进度条显示
                            Call<PersonInfo> personInfo = mApi.getPersonInfo(userId);//登录成功后查询用户信息
                            personInfo.enqueue(new Callback<PersonInfo>() {
                                @Override
                                public void onResponse(Call<PersonInfo> call, Response<PersonInfo> response) {
                                    PersonInfo personInfo1 = response.body();
                                    PersonInfo.DataBean dataBean = personInfo1.getData();
                                    //查询用户信息后，只关闭当前的界面，不做跳转
                                    //dealWithActivity(dataBean);
                                }

                                @Override
                                public void onFailure(Call<PersonInfo> call, Throwable t) {
                                    System.out.println("查询用户信息失败====" + t.getLocalizedMessage());
                                }
                            });

                        } else if ("0".equals(code)) {
                            //-1表示空数据
                            ToastUtils.showToast(mContext, "登录失败");
                        } else if ("2".equals(code)) {
                            //-1表示空数据
                           // ToastUtils.showToast(mContext, "登录失败，原因未知");
                        } else {
                            System.out.println("登录失败,打印返回码 ===="+code);
                        }
                    }

                    @Override
                    public void onFailure(Call<LoginBean> call, Throwable t) {
                        mProgressDialog.hide();
                    //  ShowLog.d("SetPwdActivity", "错误信息=" + t.getLocalizedMessage());
                        ToastUtils.showToast(mContext, "登录失败");
                        System.out.println("SetPwdActivity错误信息=" + t.getLocalizedMessage());
                    }
                });

                //Toast.makeText(LoginActivity.this, "成功", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void showDialog(String msg){
        mProgressDialog.setMessage(msg);
        mProgressDialog.show();
    }

    public void hideDialog(){
        mProgressDialog.hide();
    }

    private void dealWithActivity(PersonInfo.DataBean bean) {
        String redIntegral = bean.getRedIntegral();
        String refereeTime = bean.getRefereeTime();
        int memberLevelId = bean.getMemberLevelId();
        String whiteIntegral = bean.getWhiteIntegral();
        int personAuthState = bean.getPersonAuthState();
        String upgradeWay = (String) bean.getUpgradeWay();
        String upgradeTime = (String) bean.getUpgradeTime();
        int enterpriseAuthState = bean.getEnterpriseAuthState();
        String memberLevelName = bean.getMemberLevelName();
        String registrationDate = bean.getRegistrationDate();//注册时间 11
        String area = bean.getArea();
        String mobilePhone = bean.getMobilePhone();
        String referee = bean.getReferee();
        String memberLevelDesc = bean.getMemberLevelDesc();
        String account = bean.getAccount();
        String safePwd = bean.getSafePwd();
        int memberId = bean.getMemberId();

        String memberName = bean.getMemberName();
        String headUrl = bean.getHeadUrl();

        //通过一个bean对象通知
//        MemberInfo memberInfo = new MemberInfo();
//        memberInfo.setRedIntegral(redIntegral); //设置红积分
//        memberInfo.setRefereeTime(refereeTime);//推荐日期
//        memberInfo.setMemberLevelId(memberLevelId);//会员等级id
//        memberInfo.setWhiteIntegral(whiteIntegral);//白积分
//        memberInfo.setPersonAuthState(personAuthState);//个人认证状态
//        memberInfo.setUpgradeWay(upgradeWay);//会员等级升级方式
//        memberInfo.setUpgradeTime(upgradeTime);//会员等级升级时间
//        memberInfo.setEnterpriseAuthState(enterpriseAuthState);//企业认证状态
//        memberInfo.setMemberLevelName(memberLevelName);//会员等级名称
//        memberInfo.setRegistrationDate(registrationDate);//注册时间
//        memberInfo.setArea(area);//地区
//        memberInfo.setMobilePhone(mobilePhone);//电话
//        memberInfo.setReferee(referee);//推荐人
//        memberInfo.setMemberLevelDesc(memberLevelDesc);//会员等级描述
//        memberInfo.setAccount(account);//现金账户
//        memberInfo.setSafePwd(safePwd);//是否设置安全密码
//        memberInfo.setMemberId(memberId);//设置会员ID
//        memberInfo.setMemberName(memberName);//设置会员名称
//        memberInfo.setHeadUrl(headUrl);//头像的URL

        System.out.println("登录后获取会员信息成功");
        System.out.println("headUrl = " + headUrl);
        SPUtils.putString(mContext, "redIntegral", redIntegral);
        SPUtils.putString(mContext, "refereeTime", refereeTime);
        SPUtils.putString(mContext, "memberLevelId", memberLevelId + "");//int 会员等级ID，默认普通会员
        SPUtils.putString(mContext, "whiteIntegral", whiteIntegral);
        SPUtils.putString(mContext, "personAuthState", personAuthState + "");
        SPUtils.putString(mContext, "upgradeWay", upgradeWay);
        SPUtils.putString(mContext, "upgradeTime", upgradeTime);
        SPUtils.putString(mContext, "enterpriseAuthState", enterpriseAuthState + "");//企业认证状态，int未认证
        SPUtils.putString(mContext, "memberLevelName", memberLevelName);
        SPUtils.putString(mContext, "registrationDate", registrationDate);
        SPUtils.putString(mContext, "area", area);
        SPUtils.putString(mContext, "mobilePhone", mobilePhone);
        SPUtils.putString(mContext, "referee", referee);//推荐人
        SPUtils.putString(mContext, "memberLevelDesc", memberLevelDesc);
        SPUtils.putString(mContext, "account", account);//现金账户余额
        SPUtils.putString(mContext, "safePwd", safePwd);
        SPUtils.putString(mContext, "memberId", memberId + "");//int 会员ID
        SPUtils.putString(mContext, "memberName", memberName);
        SPUtils.putString(mContext, "headUrl", Constance.BASE_HOST + headUrl);

        //通过EventBus发送数据，哪里注册修改奶数据
        //EventBus.getDefault().post(memberInfo);
        finish();//最后关闭当前界面
    }

    //登录成功 修改UI
    public void afterLogin(boolean isLoginSuccess) {
        if (isLoginSuccess) {
            //修改UI
            finish();
        } else {
            ToastUtils.showToast(this, "请仔细查看验证码");
        }
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
}
