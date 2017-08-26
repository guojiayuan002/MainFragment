package com.jiayuan.mainframework.adapter;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.jiayuan.mainframework.R;
import com.jiayuan.mainframework.bean.MyTestBean;

import java.util.List;

/**
 * Created by guojiayuan on 2017/8/24.
 */

public class MyTestAdapter extends BaseMultiItemQuickAdapter<MyTestBean,BaseViewHolder> {
    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param data A new list is created out of this one to avoid mutable list
     */
    public MyTestAdapter(List<MyTestBean> data) {
        super(data);
        addItemType(MyTestBean.TEXT, R.layout.text_view);
        addItemType(MyTestBean.IMG, R.layout.image_view);
    }

    @Override
    protected void convert(BaseViewHolder helper, MyTestBean item) {
        switch (helper.getItemViewType()) {
            case MyTestBean.TEXT:
                helper.setText(R.id.test_text,"文档0");
                break;
            case MyTestBean.IMG:

                break;
        }

    }
}
