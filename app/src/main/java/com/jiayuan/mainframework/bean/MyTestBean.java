package com.jiayuan.mainframework.bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;

/**
 * Created by guojiayuan on 2017/8/24.
 */

public class MyTestBean implements MultiItemEntity {


    public static final int TEXT = 1;
    public static final int IMG = 2;
    private int itemType;

    //public MyTestBean(int itemType) {
//        this.itemType = itemType;
//    }

    @Override
    public int getItemType() {
        return itemType;
    }
}
