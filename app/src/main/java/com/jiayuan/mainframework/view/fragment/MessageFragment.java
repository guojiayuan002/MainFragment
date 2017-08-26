package com.jiayuan.mainframework.view.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.jiayuan.mainframework.R;
import com.jiayuan.mainframework.adapter.MessageRVAdapter;
import com.jiayuan.mainframework.base.BaseFragment;
import com.jiayuan.mainframework.utils.ToastUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guojiayuan on 2017/8/22.
 */
public class MessageFragment extends BaseFragment implements BaseQuickAdapter.OnItemClickListener, BaseQuickAdapter.OnItemLongClickListener, BaseQuickAdapter.OnItemChildClickListener {

    private RecyclerView mRecyclerView;
    private List<String> mDataList = new ArrayList<>();
    private MessageRVAdapter mAdapter;

    @Override
    public void startloadData() {
        for (int i = 0; i < 15; i++) {
            mDataList.add("我是条目=" + i);
        }
        //http://www.jianshu.com/p/b343fcff51b0
     //   MyTestAdapter myTestAdapter = new MyTestAdapter(mDataList);
        mAdapter = new MessageRVAdapter(mDataList);
        mAdapter.setOnItemClickListener(this);
        mAdapter.setOnItemLongClickListener(this);
        mAdapter.setOnItemChildClickListener(this);
        mAdapter.openLoadAnimation(mAdapter.SCALEIN);//列表加载动画
        mAdapter.isFirstOnly(false);//默认只执行一次，打开的多次


//        mAdapter.setOnLoadMoreListener(new BaseQuickAdapter.RequestLoadMoreListener() {
//            @Override
//            public void onLoadMoreRequested() {
//                mRecyclerView.postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//                        //mAdapter.setEnableLoadMore(false);
//                        //mAdapter.loadMoreFail();
//                        mAdapter.loadMoreComplete();//完成
//                        ToastUtils.showToast(mContext, "加载更多");
//                    }
//                }, 1000);
//
//            }
//        });
//        mAdapter.loadMoreComplete();//完成
//        mAdapter.loadMoreFail();//加载失败
        //mAdapter.setPreLoadNumber(1);//预加载


//        mAdapter.setUpFetchEnable(true);//下拉加载
//        mAdapter.setUpFetchListener(new BaseQuickAdapter.UpFetchListener() {
//            @Override
//            public void onUpFetch() {
//                startUpFetch();
//            }
//        });

        onLoadDataSuccess();
    }

    private void startUpFetch() {
        /**
         * set fetching on when start network request.
         */
        mAdapter.setUpFetching(true);
        /**
         * get data from internet.
         */
        mRecyclerView.postDelayed(new Runnable() {
            @Override
            public void run() {
                ToastUtils.showToast(mContext, "刷新成功");
            }
        }, 3000);
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

    @Override
    public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
        //不和onItemChildClick，同时响应
        ToastUtils.showToast(mContext, "我是条目" + position + "===haha");

    }

    //item 长点击
    @Override
    public boolean onItemLongClick(BaseQuickAdapter adapter, View view, int position) {
        return false;
    }

    //item里的某一个ID被点击
    @Override
    public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
        switch (view.getId()) {
            case R.id.hello:
                ToastUtils.showToast(mContext, "我是条目" + position + "的hello");
                break;
            case R.id.world:
                ToastUtils.showToast(mContext, "我是条目" + position + "的world");
                break;

        }
    }
}
