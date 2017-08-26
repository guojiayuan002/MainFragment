package com.jiayuan.mainframework.view.activity;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.jiayuan.mainframework.R;
import com.jiayuan.mainframework.base.BaseActivity;
import com.jiayuan.mainframework.utils.PhoneUtil;
import com.jiayuan.mainframework.utils.ToastUtils;

import butterknife.BindView;
import butterknife.OnClick;


/**
 * Created by Administrator on 2017/6/2.
 */
public class PhoneRegistActivity extends BaseActivity implements TextWatcher {

    @BindView(R.id.et_phone_regist)
    EditText mEtPhoneRegist;
    @BindView(R.id.btn_phone_next)
    Button mBtnPhoneNext;
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    private String mPhone;

    @Override
    protected int getResView() {
        return R.layout.activity_phoneregist;
    }

    @Override
    protected void initData() {
        mEtPhoneRegist.addTextChangedListener(this);
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
                finish();
                break;
        }
        return true;
    }

    @OnClick({R.id.btn_phone_next})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_phone_next:
                if (PhoneUtil.judgePhoneNums(mPhone)) {
                    //TODO 有个bug
                    Intent intent = new Intent(mContext, SetPwdActivity.class);
                    intent.putExtra("phone", mPhone);
                    startActivity(intent);
                    PhoneRegistActivity.this.finish();
                } else {
                    ToastUtils.showToast(this, "电话号码不合法");
                    return;
                }
                break;
        }
    }


    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        mPhone = mEtPhoneRegist.getText().toString().trim();

        if (TextUtils.isEmpty(s.toString())) {
            return;
        }
        int length = mPhone.length();

        if (length == 11) {
            mBtnPhoneNext.setBackgroundResource(R.mipmap.login_btn_pre3x);
        } else {
            mBtnPhoneNext.setBackgroundResource(R.mipmap.login_btn3x);
        }
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }

    @Override
    public void afterTextChanged(Editable s) {

    }


}
