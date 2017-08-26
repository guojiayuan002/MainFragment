package com.jiayuan.mainframework.utils;


import com.jiayuan.mainframework.base.BaseFragment;
import com.jiayuan.mainframework.view.fragment.HomeFragment;
import com.jiayuan.mainframework.view.fragment.MeFragment;
import com.jiayuan.mainframework.view.fragment.MessageFragment;
import com.jiayuan.mainframework.view.fragment.ShoppingCartFragment;

public class FragmentFactory {

    private static HomeFragment sHomeFragment;
    private static MessageFragment sMessageFragment;
    private static ShoppingCartFragment sShoppingCartFragment;
    private static MeFragment sMeFragment;

    public static BaseFragment getFragment(int position){
        BaseFragment baseFragment = null;
        switch (position) {
            case 0:
                if (sHomeFragment==null){
                    sHomeFragment = new HomeFragment();
                }
                baseFragment = sHomeFragment;
                break;
            case 1:
                if (sMessageFragment==null){
                    sMessageFragment = new MessageFragment();
                }
                baseFragment = sMessageFragment;
                break;
            case 2:
                if (sShoppingCartFragment==null){
                    sShoppingCartFragment = new ShoppingCartFragment();
                }
                baseFragment = sShoppingCartFragment;
                break;
            case 3:
                if (sMeFragment==null){
                    sMeFragment = new MeFragment();
                }
                baseFragment = sMeFragment;
                break;
        }
        return baseFragment;

    }

}
