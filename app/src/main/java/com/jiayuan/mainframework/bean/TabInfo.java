package com.jiayuan.mainframework.bean;
import android.os.Bundle;

public class TabInfo {
        String title;
        Class clz;
        Bundle mBundle;

        public TabInfo(String title, Class clz, Bundle bundle) {
            this.title = title;
            this.clz = clz;
            mBundle = bundle;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Class getClz() {
            return clz;
        }

        public void setClz(Class clz) {
            this.clz = clz;
        }

        public Bundle getBundle() {
            return mBundle;
        }

        public void setBundle(Bundle bundle) {
            mBundle = bundle;
        }
    }