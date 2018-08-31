package com.example.asus.dine_restaurant_finder.fragment;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.asus.dine_restaurant_finder.R;

/**
 * Created by Administrator on 23/08/2018.
 */

public class Details_Fragment extends Fragment {
    ImageView imageView;
    TabLayout tabLayout_details;
    ViewPager viewPager_details;
//    public static Favourites_Fragment newInstance() {
//        Favourites_Fragment fragment = new Favourites_Fragment();
//        return fragment;
//    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_layout_details, container, false);
        imageView = (ImageView) v.findViewById(R.id.imginfo_detais);

        controll_image();
        return v;
    }

    private void controll_image() {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher_background);
        RoundedBitmapDrawable roundedBitmapDrawable = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        roundedBitmapDrawable.setCircular(true);
        imageView.setImageDrawable(roundedBitmapDrawable);
    }


}
