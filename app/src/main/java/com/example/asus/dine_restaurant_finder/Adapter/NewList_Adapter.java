package com.example.asus.dine_restaurant_finder.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asus.dine_restaurant_finder.Event.NewList;
import com.example.asus.dine_restaurant_finder.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class NewList_Adapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<NewList> newListList;

    public NewList_Adapter(Context context, int layout, List<NewList> newListList) {
        this.context = context;
        this.layout = layout;
        this.newListList = newListList;
    }

    @Override
    public int getCount() {
        return newListList.size();
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
        TextView txtTitle, txtContent, txtDate;
        ImageView imgHinh;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder holder;

        if (view == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder.txtTitle = (TextView) view.findViewById(R.id.txttieude_newlis);
            holder.txtContent = (TextView) view.findViewById(R.id.txtnoidung_newlist);
            holder.txtDate = (TextView) view.findViewById(R.id.txtngay_newlist);
            holder.imgHinh = (ImageView)view.findViewById(R.id.imghinh_newlist);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }

        NewList newList = newListList.get(i);

        holder.txtTitle.setText(newList.getTitle());
        holder.txtDate.setText(newList.getDate());
        holder.txtContent.setText(newList.getContent());
        Picasso.with(context).load(newList.getImage())
                .placeholder(R.drawable.anhdep)
                .error(R.drawable.background_signup)
                .into(holder.imgHinh);
        return view;
    }
}
