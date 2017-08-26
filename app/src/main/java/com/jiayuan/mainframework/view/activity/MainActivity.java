package com.jiayuan.mainframework.view.activity;

import android.graphics.Color;
import android.os.Build;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.ashokvarma.bottomnavigation.TextBadgeItem;
import com.jiayuan.mainframework.R;
import com.jiayuan.mainframework.base.BaseActivity;
import com.jiayuan.mainframework.base.BaseFragment;
import com.jiayuan.mainframework.utils.FragmentFactory;

public class MainActivity extends BaseActivity implements BottomNavigationBar.OnTabSelectedListener {

    private BottomNavigationBar mBottomNavigationBar;
    private TextBadgeItem mBadgeItem;

    @Override
    protected int getResView() {
        //一配置，整个activity都沉浸
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
        return R.layout.activity_main;
    }

    @Override
    protected void initData() {
        mBottomNavigationBar = (BottomNavigationBar) findViewById(R.id.bottom_navigation_bar);
        initBottomNavigation();
        initFirstFragment();
    }

    private void initBottomNavigation() {

        BottomNavigationItem contactItem = new BottomNavigationItem(R.mipmap.hostclick, "首页");
        mBottomNavigationBar.addItem(contactItem);

        BottomNavigationItem nearbItem = new BottomNavigationItem(R.mipmap.meclick3x, "消息");
        mBottomNavigationBar.addItem(nearbItem);

        BottomNavigationItem conversationItem = new BottomNavigationItem(R.mipmap.cartclick3x, "购物车");
        mBadgeItem = new TextBadgeItem();
        mBadgeItem.setGravity(Gravity.RIGHT);
        mBadgeItem.setTextColor("#ffffff");
        mBadgeItem.setBackgroundColor("#ff0000");
        mBadgeItem.setText("5");
        mBadgeItem.show();

        conversationItem.setBadgeItem(mBadgeItem);
        mBottomNavigationBar.addItem(conversationItem);


        BottomNavigationItem pluginItem = new BottomNavigationItem(R.mipmap.meclick3x, "我的");
        mBottomNavigationBar.addItem(pluginItem);
        // mBottomNavigationBar.setActiveColor(R.color.btn_normal);//背景颜色的
        mBottomNavigationBar.setInActiveColor(R.color.inActive);//未选中的颜色
        mBottomNavigationBar.hide(false);
        mBottomNavigationBar.setMode(BottomNavigationBar.MODE_FIXED);//设置显示底部文字，且没动画
        mBottomNavigationBar.initialise();
        mBottomNavigationBar.setTabSelectedListener(this);
    }

    private void initFirstFragment() {
        /**
         * 如果这个Activity中已经有老（就是Activity保存的历史的状态，又恢复了）的Fragment，先全部移除
         */
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
        for (int i = 0; i < 3; i++) {
            Fragment fragment = supportFragmentManager.findFragmentByTag(i + "");
            if (fragment != null) {
                fragmentTransaction.remove(fragment);
            }
        }
        fragmentTransaction.commit();

        getSupportFragmentManager().beginTransaction().add(R.id.fl_content, FragmentFactory.getFragment(0), "0").commit();

    }

    @Override
    public void onTabSelected(int position) {
        /**
         * 先判断当前Fragment是否被添加到了MainActivity中
         * 如果添加了则直接显示即可
         * 如果没有添加则添加，然后显示
         */
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        BaseFragment fragment = FragmentFactory.getFragment(position);
        if (!fragment.isAdded()) {
            transaction.add(R.id.fl_content, fragment, "" + position);
        }
        transaction.show(fragment).commit();

    }

    @Override
    public void onTabUnselected(int position) {
        getSupportFragmentManager().beginTransaction().hide(FragmentFactory.getFragment(position)).commit();
    }

    @Override
    public void onTabReselected(int position) {
    }
}
