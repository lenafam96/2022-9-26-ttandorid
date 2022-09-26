package com.example.bai4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListViewAdapter_bai7 extends BaseAdapter {
    Context context;
    String[] list;
    int[] flags;
    LayoutInflater inflater;

    public ListViewAdapter_bai7(Context context, String[] country, int[] flag) {
        this.context = context;
        this.list = country;
        this.flags = flag;
        inflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return list.length;
    }

    public String getName(int position){
        return list[position];
    }

    @Override
    public Object getItem(int position) {
        return null;
    }
    @Override
    public long getItemId(int position) {
        return 0;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.listview_bai7, parent, false);
        TextView country = (TextView) convertView.findViewById(R.id.name);
        ImageView flag = (ImageView) convertView.findViewById(R.id.image);
        country.setText(list[position]);
        flag.setImageResource(flags[position]);
        return convertView;
    }
}
