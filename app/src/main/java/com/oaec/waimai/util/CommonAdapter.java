package com.oaec.waimai.util;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by Kevin on 2016/9/26.
 * Description：
 */
public abstract class CommonAdapter<T> extends BaseAdapter {
    private Context context;
    private List<T> list;
    private int layoutId;

    public CommonAdapter(Context context, List<T> list, int layoutId) {
        this.context = context;
        this.list = list;
        this.layoutId = layoutId;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        ViewHolder holder = ViewHolder.getInstance(context, convertView, layoutId, position);
        convert(position,holder,list.get(position));
        return holder.getConvertView();
    }

    public void onDataSetChanged(List<T> list){
        this.list = list;
        notifyDataSetChanged();
    }

    public abstract void convert(int position, ViewHolder holder,T t);
}
