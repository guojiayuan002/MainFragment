package com.jiayuan.mainframework.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.jiayuan.mainframework.R;

import java.util.List;

/**
 * Created by guojiayuan on 2017/8/24.
 */

public class MessageRVAdapter extends BaseQuickAdapter<String, BaseViewHolder> {


    public MessageRVAdapter(@Nullable List<String> data) {
        super(R.layout.item_message, data);
    }

    @Override
    protected void convert(BaseViewHolder viewHolder, String item) {
        viewHolder.setText(R.id.hello, item)
                .setText(R.id.world, item)
                .addOnClickListener(R.id.hello)
                .addOnClickListener(R.id.world);
//                .linkify(R.id.tweetText);
    }
}
