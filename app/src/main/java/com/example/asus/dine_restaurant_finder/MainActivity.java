package com.example.asus.dine_restaurant_finder;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.asus.dine_restaurant_finder.fragment.Fragment_NewList;

//import com.example.asus.dine_restaurant_finder.fragment.Favourites_Fragment;

public class MainActivity extends AppCompatActivity {
    public static Toolbar mToolbar;

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        interfaceVariable();

        ///////////////////////////////////////////////////////////////////////////
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);


        /////////////////////////////////////////////////////////////////////////
        drawerLayout = (DrawerLayout)findViewById(R.id.drawerlayout_main) ;

        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.Open, R.string.Close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView nav_view = (NavigationView) findViewById(R.id.nav_view_main);

        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.isChecked()) item.setChecked(false);
                else item.setChecked(true);

                drawerLayout.closeDrawers();

                int id = item.getItemId();

                if (id == R.id.notification)
                {

                    Toast.makeText(MainActivity.this,"My Profile", Toast.LENGTH_LONG).show();
                }
                if (id == R.id.news)
                {
                    android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.ftmain, new Fragment_NewList());
                    ft.commit();
                    Toast.makeText(MainActivity.this,"My news", Toast.LENGTH_LONG).show();
                }
                if (id == R.id.bookmarks)
                {
                    Toast.makeText(MainActivity.this,"My bookmarks", Toast.LENGTH_LONG).show();
                }
                if (id == R.id.offers)
                {
                    Toast.makeText(MainActivity.this,"My offers", Toast.LENGTH_LONG).show();
                }
                if (id == R.id.orders)
                {
                    Toast.makeText(MainActivity.this,"My orders", Toast.LENGTH_LONG).show();
                }
                if (id == R.id.payments)
                {
                    Toast.makeText(MainActivity.this,"My payments", Toast.LENGTH_LONG).show();
                }
                if (id == R.id.comments)
                {
                    Toast.makeText(MainActivity.this,"My comments", Toast.LENGTH_LONG).show();
                }
                if (id == R.id.profile)
                {
                    Toast.makeText(MainActivity.this,"My Profile", Toast.LENGTH_LONG).show();
                }
                if (id == R.id.settings)
                {
                    Toast.makeText(MainActivity.this,"My settings", Toast.LENGTH_LONG).show();
                }


                return true;
            }
        });

    }

    //////////////////////////////////////////////////////////////////
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
//        int id = item.getItemId();
//        DisplaySelectedScreen(id);
//        return  true;
        return actionBarDrawerToggle.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }
}
