package com.oaec.waimai.fragment;

import com.oaec.waimai.R;
import com.umeng.analytics.MobclickAgent;

import org.xutils.view.annotation.ContentView;

/**
 * Created by Kevin on 2016/10/8.
 * Description：首页的Fragment
 */
@ContentView(R.layout.fragment_order)
public class OrderFragment extends BaseFragment {
    @Override
    public void onResume() {
        super.onResume();
        MobclickAgent.onPageStart("订单");
    }

    @Override
    public void onPause() {
        super.onPause();
        MobclickAgent.onPageEnd("订单");
    }
}
