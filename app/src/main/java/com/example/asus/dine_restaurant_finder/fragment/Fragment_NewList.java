package com.example.asus.dine_restaurant_finder.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.asus.dine_restaurant_finder.Adapter.New_List_Adapter;
import com.example.asus.dine_restaurant_finder.Event.New_List_Class;
import com.example.asus.dine_restaurant_finder.MainActivity;
import com.example.asus.dine_restaurant_finder.R;

import java.util.ArrayList;

/**
 * Created by Administrator on 24/08/2018.
 */

public class Fragment_NewList extends Fragment {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;

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
        initNav(view);
        adapter = new New_List_Adapter(getContext(),arrayList, R.layout.dong_new_list);
        lv_newlist.setAdapter(adapter);
    }

    private void initNav(View view) {
        AppCompatActivity activity = (AppCompatActivity) getActivity();

        drawerLayout = (DrawerLayout )view.findViewById(R.id.drawer_layout_newlist);

        actionBarDrawerToggle = new ActionBarDrawerToggle(getActivity(), drawerLayout, R.string.Open, R.string.Close);
        actionBarDrawerToggle.setDrawerIndicatorEnabled(true);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        activity.getSupportActionBar().setHomeButtonEnabled(true);

        final NavigationView nav_view = (NavigationView) view.findViewById(R.id.nav_view_newlist);

        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                if (id == R.id.notification)
                {
                    Toast.makeText(getContext(),"My Profile", Toast.LENGTH_LONG).show();
                }
                if (id == R.id.news)
                {
                    Toast.makeText(getContext(),"My news", Toast.LENGTH_LONG).show();
                }
                if (id == R.id.bookmarks)
                {
                    Toast.makeText(getContext(),"My bookmarks", Toast.LENGTH_LONG).show();
                }
                if (id == R.id.offers)
                {
                    Toast.makeText(getContext(),"My offers", Toast.LENGTH_LONG).show();
                }
                if (id == R.id.orders)
                {
                    Toast.makeText(getContext(),"My orders", Toast.LENGTH_LONG).show();
                }
                if (id == R.id.payments)
                {
                    Toast.makeText(getContext(),"My payments", Toast.LENGTH_LONG).show();
                }
                if (id == R.id.comments)
                {
                    Toast.makeText(getContext(),"My comments", Toast.LENGTH_LONG).show();
                }
                if (id == R.id.profile)
                {
                    Toast.makeText(getContext(),"My Profile", Toast.LENGTH_LONG).show();
                }
                if (id == R.id.settings)
                {
                    Toast.makeText(getContext(),"My settings", Toast.LENGTH_LONG).show();
                }


                return true;
            }
        });
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


        @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return actionBarDrawerToggle.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//            case android.R.id.home:
//                drawerLayout.openDrawer(GravityCompat.START);
//                return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }
}
