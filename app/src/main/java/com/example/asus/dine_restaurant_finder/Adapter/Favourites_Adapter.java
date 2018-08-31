package com.example.asus.dine_restaurant_finder.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asus.dine_restaurant_finder.Event.Favourites_Class;
import com.example.asus.dine_restaurant_finder.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class Favourites_Adapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Favourites_Class>  favouritesList;

    public Favourites_Adapter(Context context, int layout, List<Favourites_Class> favouritesList) {
        this.context = context;
        this.layout = layout;
        this.favouritesList = favouritesList;
    }

    @Override
    public int getCount() {
        return favouritesList.size();
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
        TextView txtTitle_favourites, txtContent_favourites;
        ImageView imgHinh_favourites;
    }

    @Override
    public View getView(int i, View view_favourites, ViewGroup viewGroup) {

        ViewHolder holder_favourites;
        if (view_favourites == null){
            holder_favourites = new ViewHolder();
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view_favourites = layoutInflater.inflate(layout,null);
            holder_favourites.txtTitle_favourites=(TextView)view_favourites.findViewById(R.id.txt_Title_favourites);
            holder_favourites.txtContent_favourites=(TextView)view_favourites.findViewById(R.id.txt_Content_favourites);
            holder_favourites.imgHinh_favourites=(ImageView)view_favourites.findViewById(R.id.img_hinh_favourites);

            view_favourites.setTag(holder_favourites);
        }else {
            holder_favourites = (ViewHolder) view_favourites.getTag();
        }

        Favourites_Class favourites_class = favouritesList.get(i);

        holder_favourites.txtTitle_favourites.setText(favourites_class.getTitle());
        holder_favourites.txtContent_favourites.setText(favourites_class.getContent());
        Picasso.with(context).load(favourites_class.getImgHinh())
                .placeholder(R.drawable.anhdep)
                .error(R.drawable.background_signup)
                .into(holder_favourites.imgHinh_favourites);

        return view_favourites;
    }
}
