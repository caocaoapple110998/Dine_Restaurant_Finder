package com.example.asus.dine_restaurant_finder.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asus.dine_restaurant_finder.R;

/**
 * Created by Administrator on 21/08/2018.
 */

public class Favourites_Fragment extends Fragment {
    public static Favourites_Fragment newInstance() {
        Favourites_Fragment fragment = new Favourites_Fragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_favourites, container, false);
    }
}