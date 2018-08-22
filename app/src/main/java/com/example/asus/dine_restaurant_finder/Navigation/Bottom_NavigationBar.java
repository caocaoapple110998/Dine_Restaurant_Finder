package com.example.asus.dine_restaurant_finder.Navigation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.asus.dine_restaurant_finder.R;
import com.example.asus.dine_restaurant_finder.fragment.Favourites_Fragment;
import com.example.asus.dine_restaurant_finder.fragment.Home_Fragment;
import com.example.asus.dine_restaurant_finder.fragment.News_Fragment;
import com.example.asus.dine_restaurant_finder.fragment.Profile_Fragment;
import com.example.asus.dine_restaurant_finder.fragment.Settings_Fragment;

public class Bottom_NavigationBar extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_bar);

        InitEvent();

    }

    public void InitEvent() {
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                switch (item.getItemId()){
                    case R.id.action_item1:
                        selectedFragment = Home_Fragment.newInstance();
                        break;
                    case R.id.action_item2:
                        selectedFragment = Profile_Fragment.newInstance();
                        break;
                    case R.id.action_item3:
                        selectedFragment = Favourites_Fragment.newInstance();
                        break;
                    case R.id.action_item4:
                        selectedFragment = News_Fragment.newInstance();
                        break;
                    case R.id.action_item5:
                        selectedFragment = Settings_Fragment.newInstance();
                        break;
                }
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_layout, selectedFragment);
                transaction.commit();

                return true;
            }
        });

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, Home_Fragment.newInstance());
        transaction.commit();
    }

}
