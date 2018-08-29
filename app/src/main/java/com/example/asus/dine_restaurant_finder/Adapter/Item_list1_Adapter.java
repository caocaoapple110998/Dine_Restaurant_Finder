package com.example.asus.dine_restaurant_finder.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asus.dine_restaurant_finder.Event.Item_List1_Class;
import com.example.asus.dine_restaurant_finder.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Administrator on 24/08/2018.
 */

public class Item_list1_Adapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Item_List1_Class> List1list;

    public Item_list1_Adapter(Context context, int layout, List<Item_List1_Class> list1list) {
        this.context = context;
        this.layout = layout;
        List1list = list1list;
    }

    @Override
    public int getCount() {
        return List1list.size();
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
        TextView txtTitle_list1, txtAddress_list1;
        ImageView imgHinh_list1;
    }

    @Override
    public View getView(int i, View view_list1, ViewGroup viewGroup) {

        ViewHolder holder_list1;

        if (view_list1 == null){
            holder_list1 = new ViewHolder();
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view_list1 = layoutInflater.inflate(layout,null);
            holder_list1.txtTitle_list1=(TextView)view_list1.findViewById(R.id.txt_tieude_item_list1);
            holder_list1.txtAddress_list1=(TextView)view_list1.findViewById(R.id.txt_diachi_item_list1);
            holder_list1.imgHinh_list1=(ImageView)view_list1.findViewById(R.id.img_item_layout_list1);

            view_list1.setTag(holder_list1);
        }else {
            holder_list1 = (ViewHolder) view_list1.getTag();
        }

        Item_List1_Class item_list1_class = List1list.get(i);

        holder_list1.txtTitle_list1.setText(item_list1_class.getTitle());
        holder_list1.txtAddress_list1.setText(item_list1_class.getAddress());
        Picasso.with(context).load(item_list1_class.getImgHinh())
                .placeholder(R.drawable.anhdep)
                .error(R.drawable.background_signup)
                .into(holder_list1.imgHinh_list1);

        return view_list1;
    }
}
