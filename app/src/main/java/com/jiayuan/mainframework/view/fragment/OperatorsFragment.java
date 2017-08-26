package com.jiayuan.mainframework.view.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.jiayuan.mainframework.R;
import com.jiayuan.mainframework.adapter.MessageRVAdapter;
import com.jiayuan.mainframework.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guojiayuan on 2017/8/24.
 */
public class OperatorsFragment extends BaseFragment {

    private RecyclerView mRecyclerView;
    private List<String> mDataList = new ArrayList<>();
    private MessageRVAdapter mAdapter;

    @Override
    public void startloadData() {
        for (int i = 0; i < 55; i++) {
            mDataList.add("我是条目=" + i);
        }
        //http://www.jianshu.com/p/b343fcff51b0
        //   MyTestAdapter myTestAdapter = new MyTestAdapter(mDataList);
        mAdapter = new MessageRVAdapter(mDataList);
        mAdapter.openLoadAnimation(mAdapter.SCALEIN);//列表加载动画
        mAdapter.isFirstOnly(false);//默认只执行一次，打开的多次

        onLoadDataSuccess();
    }


    @Override
    public View onCreateContentView() {
        View view = View.inflate(mContext, R.layout.fragment_message, null);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.message_recycle_view);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        mRecyclerView.setAdapter(mAdapter);
        return view;
    }

}
