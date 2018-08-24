package com.example.asus.dine_restaurant_finder.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListView;

import com.example.asus.dine_restaurant_finder.Adapter.Item_list1_Adapter;
import com.example.asus.dine_restaurant_finder.Adapter.New_List_Adapter;
import com.example.asus.dine_restaurant_finder.Event.Item_List1_Class;
import com.example.asus.dine_restaurant_finder.R;

import java.util.ArrayList;

/**
 * Created by Administrator on 24/08/2018.
 */

public class Fragment_Item_List1 extends Fragment {
    GridView gv_item_list1;
    ArrayList<Item_List1_Class> arrayList;
    Item_list1_Adapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_layout_list1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        adapter = new Item_list1_Adapter(getContext(),R.layout.dong_layout_list_1,arrayList);
        gv_item_list1.setAdapter(adapter);

        gv_item_list1 = (GridView) view.findViewById(R.id.gv_item_list1);
        arrayList = new ArrayList<>();
        arrayList.add(new Item_List1_Class(
                "5 time awarded - the start queen hotel",
                "LOCATED AT -",
                "45 W.Lincol St. Morganton, NY, 218864",
                "VIEW DETAIL",
                null,
                R.drawable.anhdep
        ));
    }
}
