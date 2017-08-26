package com.jiayuan.mainframework.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import com.jiayuan.mainframework.R;


/**
 * Created by guojiayuan
 */

public abstract class BaseFragment extends Fragment {

    protected Context mContext;
    protected String mArgs;
    protected int mTag;
    private static final String TAG = "BaseFragment2";

    private ProgressBar mProgressBar;
    private LinearLayout mLoadingError;
    private FrameLayout mFragmentContent;
    private ImageView mReloadData;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //获取context记录
        mContext = getActivity();
        Bundle arguments = getArguments();
        if(arguments!=null){
            mArgs = arguments.getString("args");
            mTag = arguments.getInt("catalog");
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_base, null);
        mProgressBar = (ProgressBar) root.findViewById(R.id.base_progress_bar);
        mLoadingError = (LinearLayout) root.findViewById(R.id.base_loading_error);
        mFragmentContent = (FrameLayout) root.findViewById(R.id.fragment_content);
        mReloadData = (ImageView) root.findViewById(R.id.base_iv_error);
        mReloadData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mProgressBar.setVisibility(View.VISIBLE);
                mLoadingError.setVisibility(View.GONE);
                startloadData();
            }
        });
        return root;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        startloadData();
    }

    //子类必须实现--开始加载数据
    public abstract void startloadData();

    //子类必须实现--请求数据成功创建的视图
    public abstract View onCreateContentView();



    protected void onLoadDataSuccess() {
        mProgressBar.setVisibility(View.GONE);
        mFragmentContent.addView(onCreateContentView());
    }

    protected void onLoadDataFailed() {
        mProgressBar.setVisibility(View.GONE);
        mLoadingError.setVisibility(View.VISIBLE);
    }
}
