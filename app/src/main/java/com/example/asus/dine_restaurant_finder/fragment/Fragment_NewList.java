package com.example.asus.dine_restaurant_finder.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.example.asus.dine_restaurant_finder.Adapter.New_List_Adapter;
import com.example.asus.dine_restaurant_finder.Event.New_List_Class;
import com.example.asus.dine_restaurant_finder.R;

import java.util.ArrayList;

/**
 * Created by Administrator on 24/08/2018.
 */

public class Fragment_NewList extends Fragment {

    ListView lv_newlist;
    ArrayList<New_List_Class> arrayList;
    New_List_Adapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_new_list, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        
        initToolBar(view);
        initEvent(view);
        adapter = new New_List_Adapter(getContext(),arrayList, R.layout.dong_new_list);
        lv_newlist.setAdapter(adapter);
    }

    private void initEvent(View view) {
        lv_newlist = (ListView) view.findViewById(R.id.lv_newlist);
        arrayList = new ArrayList<>();

        arrayList.add(new New_List_Class(
                "Restaurants may be classified or distinguished in different ways.",
                "2nd July 2017",
                "The primary factors are usually the food itself the cuisine and/or the style of offering Beyond this, restaurants may differentiate themselves on factors including speed formality, location, cost, service, or novelty themes.",
                R.drawable.newlist));
        arrayList.add(new New_List_Class(
                "Restaurants may be classified or distinguished in different ways.",
                "2nd July 2017",
                "The primary factors are usually the food itself the cuisine and/or the style of offering Beyond this, restaurants may differentiate themselves on factors including speed formality, location, cost, service, or novelty themes.",
                R.drawable.newlist));
        arrayList.add(new New_List_Class(
                "Restaurants may be classified or distinguished in different ways.",
                "2nd July 2017",
                "The primary factors are usually the food itself the cuisine and/or the style of offering Beyond this, restaurants may differentiate themselves on factors including speed formality, location, cost, service, or novelty themes.",
                R.drawable.newlist));
        arrayList.add(new New_List_Class(
                "Restaurants may be classified or distinguished in different ways.",
                "2nd July 2017",
                "The primary factors are usually the food itself the cuisine and/or the style of offering Beyond this, restaurants may differentiate themselves on factors including speed formality, location, cost, service, or novelty themes.",
                R.drawable.newlist));
    }

    private void initToolBar(View view) {
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        AppCompatActivity activity = (AppCompatActivity) getActivity();
        activity.setSupportActionBar(toolbar);
        activity.getSupportActionBar().setDisplayShowTitleEnabled(false);

        TextView mTitle = (TextView) toolbar.findViewById(R.id.toolbar_title);
    }
    
}
