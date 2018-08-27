package com.example.asus.dine_restaurant_finder.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.asus.dine_restaurant_finder.Adapter.Item_list2_Adapter;
import com.example.asus.dine_restaurant_finder.Event.Item_list2_Class;
import com.example.asus.dine_restaurant_finder.R;

import java.util.ArrayList;

public class Fragment_Tablayout_List2 extends Fragment {

    ListView lv_newlist;
    ArrayList<Item_list2_Class> arrayList;
    Item_list2_Adapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.item_layout_list_2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initEvent(view);
    }

    private void initEvent(View view) {
        lv_newlist = (ListView) view.findViewById(R.id.girdview_fragment_layout_list_2);
        arrayList = new ArrayList<>();
    }
}
