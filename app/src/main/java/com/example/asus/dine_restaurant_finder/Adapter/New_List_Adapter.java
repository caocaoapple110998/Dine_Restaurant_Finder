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
import java.util.List;

/**
 * Created by Administrator on 24/08/2018.
 */

public class New_List_Adapter extends BaseAdapter {

    private Context context;
    private ArrayList<New_List_Class> arrayList;
    private int layout;

    public New_List_Adapter(Context context, ArrayList<New_List_Class> arrayList, int layout) {
        this.context = context;
        this.arrayList = arrayList;
        this.layout = layout;
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
    public View getView(int i, View view, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(layout,null);

        TextView txtTieuDe = (TextView) view.findViewById(R.id.txttieude_newlis);
        TextView txtNgay = (TextView) view.findViewById(R.id.txtngay_newlist);
        TextView txtNoiDung = (TextView) view.findViewById(R.id.txtnoidung_newlist);
        ImageView imgHinh = (ImageView) view.findViewById(R.id.imghinh_newlist);

        New_List_Class new_list_class = arrayList.get(i);

        txtTieuDe.setText(new_list_class.getTieude());
        txtNgay.setText(new_list_class.getNgay());
        txtNoiDung.setText(new_list_class.getNoidung());
        imgHinh.setImageResource(new_list_class.getHinh());
        return view;
    }
}
