package com.example.asus.dine_restaurant_finder.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.asus.dine_restaurant_finder.Item_list2;
import com.example.asus.dine_restaurant_finder.R;

import java.util.List;

public class Item_list2_Adapter extends BaseAdapter{

    private Context context;
    private int layout;
    private List<Item_list2> item_list2List;

    public Item_list2_Adapter(Context context, int layout, List<Item_list2> item_list2List) {
        this.context = context;
        this.layout = layout;
        this.item_list2List = item_list2List;
    }

    @Override
    public int getCount() {
        return item_list2List.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        ImageView imgHinh;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder holder;

        if (view == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null );
            holder.imgHinh = view.findViewById(R.id.img_item_layout_list2);
        }

        return null;
    }
}
