package com.example.asus.dine_restaurant_finder.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.asus.dine_restaurant_finder.Event.Demo;
import com.example.asus.dine_restaurant_finder.R;

import java.util.ArrayList;

public class Demo_Adapter extends BaseAdapter {

    private Context context;
    private int layout;
    private ArrayList<Demo> arrayListdemo;

    public Demo_Adapter(Context context, int layout, ArrayList<Demo> arrayListdemo) {
        this.context = context;
        this.layout = layout;
        this.arrayListdemo = arrayListdemo;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.fragment_demo, null);


        TextView txtdemo = (TextView) view.findViewById(R.id.txtdemo);
        TextView txtdemo1 = (TextView) view.findViewById(R.id.txtdemo1);

        Demo demo = arrayListdemo.get(i);

        txtdemo.setText(demo.getTxt1());
        txtdemo1.setText(demo.getTxt2());

        return view;
    }
}
