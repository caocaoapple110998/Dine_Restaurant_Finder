package com.example.asus.dine_restaurant_finder.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asus.dine_restaurant_finder.R;

/**
 * Created by Administrator on 21/08/2018.
 */

public class Home_Fragment extends Fragment {

    private Toolbar toolbar;

    public static Home_Fragment newInstance() {
        Home_Fragment fragment = new Home_Fragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.dong_layout_list_1, container, false);

//        toolbar = (Toolbar) v.findViewById(R.id.toolbar);
//        AppCompatActivity activity = (AppCompatActivity) getActivity();
//        activity.setSupportActionBar(toolbar);

    return v;
    }


//    public boolean onCreateOptionsMenu( Menu menu) {
////        getActivity().getMenuInflater().inflate( R.menu.menu_search_toolbar, menu);
////
////        MenuItem myActionMenuItem = menu.findItem(R.id.action_search);
////        final SearchView searchView = (SearchView) myActionMenuItem.getActionView();
////        searchView.setQueryHint("Search by landmark");
////        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
////            @Override
////            public boolean onQueryTextSubmit(String query) {
////                return false;
////            }
////
////            @Override
////            public boolean onQueryTextChange(String newText) {
////                if (TextUtils.isEmpty(newText)) {
////
////                } else {
////                }
////                return true;
////            }
////        });
////
////        return true;
    }

