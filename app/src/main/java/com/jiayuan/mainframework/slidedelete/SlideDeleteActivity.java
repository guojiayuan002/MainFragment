package com.jiayuan.mainframework.slidedelete;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.jiayuan.mainframework.R;

/**
 * Created by guojiayuan on 2017/8/22.
 */

public class SlideDeleteActivity extends AppCompatActivity {

    private SlideDeleteView mSlideDeleteView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_slide_delete);
        mSlideDeleteView = (SlideDeleteView) findViewById(R.id.SlideDeleteView);
    }

    public void clickItem(View view){
        mSlideDeleteView.quickClose();
        // mDatas.remove(holder.getAdapterPosition());
    }
}
