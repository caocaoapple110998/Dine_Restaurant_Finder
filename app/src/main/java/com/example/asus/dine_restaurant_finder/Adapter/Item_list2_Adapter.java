package com.example.asus.dine_restaurant_finder.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asus.dine_restaurant_finder.Event.New_List_Class;
import com.example.asus.dine_restaurant_finder.R;

import java.util.ArrayList;

public class Item_list2_Adapter extends BaseAdapter{

    private Context context;
    private ArrayList<New_List_Class> arrayList;
    private int layout;

    public Item_list2_Adapter(Context context, ArrayList<New_List_Class> arrayList, int layout) {
        this.context = context;
        this.arrayList = arrayList;
        this.layout = layout;
    }

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

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);

        ImageView img_item_layout_list2 = view.findViewById(R.id.img_item_layout_list2);
        TextView txtrating_item_layout_list2 = view.findViewById(R.id.txtrating_item_layout_list2);
        TextView txtten_item_layout_list2 = view.findViewById(R.id.txtrating_item_layout_list2);
        TextView txtmota_item_layout_list2 = view.findViewById(R.id.txtrating_item_layout_list2);
        TextView txtdiachi_item_layout_list2 = view.findViewById(R.id.txtrating_item_layout_list2);
        TextView txtgia_item_layout_list2 = view.findViewById(R.id.txtrating_item_layout_list2);
        TextView txtsave_item_layout_list2 = view.findViewById(R.id.txtrating_item_layout_list2);
        TextView txtgiacu_item_layout_list2 = view.findViewById(R.id.txtrating_item_layout_list2);
        TextView txtngay_item_layout_list2 = view.findViewById(R.id.txtrating_item_layout_list2);

        New_List_Class item_list2_adapter = arrayList.get(i);

        return view;
    }
}
