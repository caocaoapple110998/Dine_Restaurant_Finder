package com.example.asus.dine_restaurant_finder.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asus.dine_restaurant_finder.Event.Item_list2_Class;
import com.example.asus.dine_restaurant_finder.R;

import java.util.ArrayList;

public class Item_list2_Adapter extends BaseAdapter{

    private Context context;
    private ArrayList<Item_list2_Class> arrayList;
    private int layout;

    @Override
    public int getCount() {
        return arrayList.size();
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
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(layout,null);

        TextView txtten=(TextView)view.findViewById(R.id.txtten_item_layout_list2);
        TextView txtdiachi=(TextView)view.findViewById(R.id.txtdiachi_item_layout_list2);
        TextView txtmota=(TextView)view.findViewById(R.id.txtmota_item_layout_list2);
        TextView txtgia=(TextView)view.findViewById(R.id.txtgia_item_layout_list2);
        TextView txtsave=(TextView)view.findViewById(R.id.txtsave_item_layout_list2);
        TextView txtgiacu=(TextView)view.findViewById(R.id.txtgiacu_item_layout_list2);
        TextView txtngay=(TextView)view.findViewById(R.id.txtngay_item_layout_list2);
        ImageView imganh=(ImageView)view.findViewById(R.id.img_item_layout_list2);

        return view;
    }
}
