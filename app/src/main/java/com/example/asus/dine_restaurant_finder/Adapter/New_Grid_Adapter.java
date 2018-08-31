package com.example.asus.dine_restaurant_finder.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asus.dine_restaurant_finder.Event.NewGrid_Class;
import com.example.asus.dine_restaurant_finder.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class New_Grid_Adapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<NewGrid_Class> newGridList;

    public New_Grid_Adapter(Context context, int layout, List<NewGrid_Class> newGridList) {
        this.context = context;
        this.layout = layout;
        this.newGridList = newGridList;
    }

    @Override
    public int getCount() {
        return newGridList.size();
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
        TextView txtTitle_newGrid, txtDate_newGrid, txtContent_newGird;
        ImageView imgHinh_newGird;
    }

    @Override
    public View getView(int i, View view_newGird, ViewGroup viewGroup) {

        ViewHolder holder_newGird;

        if (view_newGird == null){
            holder_newGird = new ViewHolder();
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view_newGird = layoutInflater.inflate(layout,null);
            holder_newGird.txtTitle_newGrid = (TextView)view_newGird.findViewById(R.id.txt_title_newgrid);
            holder_newGird.txtDate_newGrid = (TextView)view_newGird.findViewById(R.id.txt_date_newgrid);
            holder_newGird.txtContent_newGird = (TextView)view_newGird.findViewById(R.id.txt_content_newgrid);
            holder_newGird.imgHinh_newGird = (ImageView)view_newGird.findViewById(R.id.img_hinh_newgrid);

            view_newGird.setTag(holder_newGird);
        }else {
            holder_newGird = (ViewHolder) view_newGird.getTag();
        }

        NewGrid_Class newGrid_class = newGridList.get(i);
        holder_newGird.txtTitle_newGrid.setText(newGrid_class.getTitle());
        holder_newGird.txtDate_newGrid.setText(newGrid_class.getDate());
        holder_newGird.txtContent_newGird.setText(newGrid_class.getContent());
        Picasso.with(context).load(newGrid_class.getImg())
                .placeholder(R.drawable.anhdep)
                .error(R.drawable.background_signup)
                .into(holder_newGird.imgHinh_newGird);

        return view_newGird;
    }
}