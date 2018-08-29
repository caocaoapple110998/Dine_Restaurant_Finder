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
import com.squareup.picasso.Picasso;

import java.util.List;

public class Item_list2_Adapter extends BaseAdapter{

    private Context context;
    private int layout;
    private List<Item_list2_Class> List2list;

    public Item_list2_Adapter(Context context, int layout, List<Item_list2_Class> list2list) {
        this.context = context;
        this.layout = layout;
        List2list = list2list;
    }

    @Override
    public int getCount() {
        return List2list.size();
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
        TextView txtRating_list2 , txtName_list2, txtAddress_list2, txtFoods_list2, txtPrice_list2, txtSave_list2, txtOld_Pirce_list2, txtDate_list2;
        ImageView imgHinh_list2;
    }

    @Override
    public View getView(int i, View view_list2, ViewGroup viewGroup) {

        ViewHolder holder_list2;

        if (view_list2 == null){
            holder_list2 = new ViewHolder();
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view_list2 = layoutInflater.inflate(layout,null);

            holder_list2.txtName_list2=(TextView)view_list2.findViewById(R.id.txtten_item_layout_list2);
            holder_list2.txtAddress_list2=(TextView)view_list2.findViewById(R.id.txtdiachi_item_layout_list2);
            holder_list2.txtFoods_list2=(TextView)view_list2.findViewById(R.id.txtmota_item_layout_list2);
            holder_list2.txtPrice_list2=(TextView)view_list2.findViewById(R.id.txtgia_item_layout_list2);
            holder_list2.txtSave_list2=(TextView)view_list2.findViewById(R.id.txtsave_item_layout_list2);
            holder_list2.txtOld_Pirce_list2=(TextView)view_list2.findViewById(R.id.txtgiacu_item_layout_list2);
            holder_list2.txtDate_list2=(TextView)view_list2.findViewById(R.id.txtngay_item_layout_list2);
            holder_list2.imgHinh_list2=(ImageView)view_list2.findViewById(R.id.img_item_layout_list2);

            view_list2.setTag(holder_list2);
        }else {
            holder_list2 = (ViewHolder) view_list2.getTag();
        }

        Item_list2_Class item_list2_class = List2list.get(i);

//        holder_list2.txtRating_list2.setText(item_list2_class.getRating());
        holder_list2.txtDate_list2.setText(item_list2_class.getDate());
        holder_list2.txtOld_Pirce_list2.setText(item_list2_class.getOld_price());
        holder_list2.txtSave_list2.setText(item_list2_class.getSave());
        holder_list2.txtAddress_list2.setText(item_list2_class.getAddress());
        holder_list2.txtPrice_list2.setText(item_list2_class.getPrice());
        holder_list2.txtFoods_list2.setText(item_list2_class.getFoods());
        holder_list2.txtName_list2.setText(item_list2_class.getName());
        Picasso.with(context).load(item_list2_class.getImghinh())
                .placeholder(R.drawable.anhdep)
                .error(R.drawable.background_signup)
                .into(holder_list2.imgHinh_list2);

        return view_list2;
    }
}
