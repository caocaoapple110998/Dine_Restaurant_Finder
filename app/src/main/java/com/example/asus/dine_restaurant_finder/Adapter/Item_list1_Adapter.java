package com.example.asus.dine_restaurant_finder.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.asus.dine_restaurant_finder.Event.Item_List1_Class;
import com.example.asus.dine_restaurant_finder.R;

import java.util.ArrayList;

/**
 * Created by Administrator on 24/08/2018.
 */

public class Item_list1_Adapter extends BaseAdapter {

    private Context context;
    private int layout;
    private ArrayList<Item_List1_Class> arrayList;

    public Item_list1_Adapter(Context context, int layout, ArrayList<Item_List1_Class> arrayList) {
        this.context = context;
        this.layout = layout;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
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
    public View getView(int i, View v, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.dong_layout_list_1, null);

        TextView txtTieuDe = (TextView) v.findViewById(R.id.txt_tieude_item_list1);
        TextView txtLocated = (TextView) v.findViewById(R.id.txt_located_item_list1);
        TextView txtDiaChi = (TextView) v.findViewById(R.id.txt_diachi_item_list1);
        TextView txtDetail = (TextView) v.findViewById(R.id.txt_view_detail_item_list1);
        RatingBar ratingBar = (RatingBar) v.findViewById(R.id.ratingBar_item_list1);
        ImageView imgHinh = (ImageView) v.findViewById(R.id.img_item_layout_list1);

        Item_List1_Class  item_list1_class = arrayList.get(i);

        txtTieuDe.setText(item_list1_class.getTieude());
        txtLocated.setText(item_list1_class.getLocated());
        txtDiaChi.setText(item_list1_class.getDiachi());
        txtDetail.setText(item_list1_class.getDetail());
        imgHinh.setImageResource(item_list1_class.getHinh());
        return v;
    }
}
