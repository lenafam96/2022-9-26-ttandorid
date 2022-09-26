package com.example.bai4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter_bai6 extends BaseAdapter {

    // Declare Variables

    Context mContext;
    LayoutInflater inflater;
    private List<AnimalNames_bai6> animalNamesBai6List = null;
    private ArrayList<AnimalNames_bai6> arraylist;

    public ListViewAdapter_bai6(Context context, List<AnimalNames_bai6> animalNamesBai6List) {
        mContext = context;
        this.animalNamesBai6List = animalNamesBai6List;
        inflater = LayoutInflater.from(mContext);
        this.arraylist = new ArrayList<AnimalNames_bai6>();
        this.arraylist.addAll(animalNamesBai6List);
    }

    public class ViewHolder {
        TextView name;
    }

    @Override
    public int getCount() {
        return animalNamesBai6List.size();
    }

    @Override
    public AnimalNames_bai6 getItem(int position) {
        return animalNamesBai6List.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(final int position, View view, ViewGroup parent) {
        final ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.listview_bai6, null);
            holder.name = (TextView) view.findViewById(R.id.name);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        // Set the results into TextViews
        holder.name.setText(animalNamesBai6List.get(position).getAnimalName());
        return view;
    }

    // Filter Class
    public void filter(String charText) {
        charText = charText.toLowerCase(Locale.getDefault());
        animalNamesBai6List.clear();
        if (charText.length() == 0) {
            animalNamesBai6List.addAll(arraylist);
        } else {
            for (AnimalNames_bai6 wp : arraylist) {
                if (wp.getAnimalName().toLowerCase(Locale.getDefault()).contains(charText)) {
                    animalNamesBai6List.add(wp);
                }
            }
        }
        notifyDataSetChanged();
    }
}
