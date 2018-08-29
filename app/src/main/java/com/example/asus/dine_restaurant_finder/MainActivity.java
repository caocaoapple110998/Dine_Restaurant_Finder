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
import com.example.asus.dine_restaurant_finder.fragment.Fragment_Tablayout_List1;
import com.example.asus.dine_restaurant_finder.fragment.Fragment_Tablayout_List2;

//import com.example.asus.dine_restaurant_finder.fragment.Favourites_Fragment;

public class MainActivity extends AppCompatActivity {
    public static Toolbar mToolbar;
//    private ViewPager viewPager;
//    private TabLayout tabLayout;

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
                    android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.ftmain, new Fragment_Tablayout_List2());
                    ft.commit();
//                    Toast.makeText(MainActivity.this,"My bookmarks", Toast.LENGTH_LONG).show();
                }
                if (id == R.id.offers)
                {
                    android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.ftmain, new Fragment_Tablayout_List1());
                    ft.commit();
//                    Toast.makeText(MainActivity.this,"My offers", Toast.LENGTH_LONG).show();
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

//    private void DisplaySelectedScreen(int id){
//        Fragment fragment = null;
//
//        switch (id){
//            case R.id.notification:
//                break;
//            case R.id.news:
//                fragment = new Fragment_NewList();
//                break;
//            case R.id.bookmarks:
//                break;
//            case R.id.offers:
//                break;
//            case R.id.payments:
//                break;
//            case R.id.comments:
//                break;
//            case R.id.profile:
//                break;
//            case R.id.settings:
//                break;
//        }
//
//        if (fragment != null){
//            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//            ft.replace(R.id.demo1, fragment);
//            ft.commit();
//        }
//        drawerLayout = (DrawerLayout)findViewById(R.id.drawerlayout_main) ;
//        drawerLayout.closeDrawer(GravityCompat.START);
//
//    }

//    private void interfaceVariable() {
////        viewPager = (ViewPager) findViewById(R.id.viewPagerHome);
////        tabLayout = (TabLayout) findViewById(R.id.tabLayoutHome);
////
////        setupViewPager(viewPager);
////        tabLayout.setupWithViewPager(viewPager);
////        setupTabIcons();
////    }

//    private void setupViewPager(ViewPager viewPager) {
//        ViewPagerAdapterHD adapter = new ViewPagerAdapterHD(getSupportFragmentManager());
//        adapter.addFragment(new Home_Fragment(), "Home");
//        adapter.addFragment(new Profile_Fragment(), "Profile");
//        adapter.addFragment(new Favourites_Fragment(), "Favourites");
//        adapter.addFragment(new Fragment_NewList(), "News");
//        adapter.addFragment(new Settings_Fragment(), "Settings");
//        viewPager.setAdapter(adapter);
//    }

//    public static class ViewPagerAdapterHD extends FragmentPagerAdapter {
//        private List<Fragment> mFragmentList = new ArrayList<>();
//        private List<String> mFragnebtTitleList = new ArrayList<>();
//
//        public ViewPagerAdapterHD(FragmentManager fm) {
//            super(fm);
//        }
//
//        @Override
//        public Fragment getItem(int position) {
//            return mFragmentList.get(position);
//        }
//
//        @Override
//        public int getCount() {
//            return mFragmentList.size();
//        }
//
//        public void addFragment(Fragment fragment, String title){
//            mFragmentList.add(fragment);
//            mFragnebtTitleList.add(title);
//        }
//
//        @Nullable
//        @Override
//        public CharSequence getPageTitle(int position) {
//            return mFragnebtTitleList.get(position);
//        }
//    }
//
//
//
//    private void setupTabIcons() {
//        tabLayout.getTabAt(0).setIcon(R.drawable.house_outline);
//        tabLayout.getTabAt(1).setIcon(R.drawable.profile);
//        tabLayout.getTabAt(2).setIcon(R.drawable.profile);
//        tabLayout.getTabAt(3).setIcon(R.drawable.newspaper);
//        tabLayout.getTabAt(4).setIcon(R.drawable.setting_menu);
//    }
//
//
//    //////////////////////////////////////////////////////////////////
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
//        int id = item.getItemId();
//        DisplaySelectedScreen(id);
//        return  true;
        return actionBarDrawerToggle.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }
//
//
//
//    @Override
//    public boolean onCreateOptionsMenu( Menu menu) {
//        getMenuInflater().inflate( R.menu.menu_search_toolbar, menu);
//
//        MenuItem myActionMenuItem = menu.findItem( R.id.action_search);
//        final SearchView searchView = (SearchView) myActionMenuItem.getActionView();
//        searchView.setQueryHint("Search by landmark");
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String newText) {
//                if (TextUtils.isEmpty(newText)) {
//
//                } else {
//                }
//                return true;
//            }
//        });
//
//        return true;
//    }

}
