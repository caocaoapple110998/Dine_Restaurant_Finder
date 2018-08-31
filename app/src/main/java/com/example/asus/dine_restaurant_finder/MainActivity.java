package com.example.asus.dine_restaurant_finder;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.asus.dine_restaurant_finder.Adapter.Item_list1_Adapter;
import com.example.asus.dine_restaurant_finder.Event.Item_List1_Class;
import com.example.asus.dine_restaurant_finder.fragment.Fragment_Comment;
import com.example.asus.dine_restaurant_finder.fragment.Fragment_Favourites;
import com.example.asus.dine_restaurant_finder.fragment.Fragment_NewGrid;
import com.example.asus.dine_restaurant_finder.fragment.Fragment_NewList;
import com.example.asus.dine_restaurant_finder.fragment.Fragment_Tablayout_List1;
import com.example.asus.dine_restaurant_finder.fragment.Fragment_Tablayout_List2;
import com.example.asus.dine_restaurant_finder.fragment.Profile_Fragment;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

//import com.example.asus.dine_restaurant_finder.fragment.Favourites_Fragment;

public class MainActivity extends AppCompatActivity {

    //////////////////////////////////
    // Gone

    LinearLayout ln_main;
    //////////////////////////////////

    //////////////////////////////////
    // List1

    String urlgetlist1 = Server.List1;
    GridView gv_list1;

    ArrayList<Item_List1_Class> arrayList_list1;
    Item_list1_Adapter adapter_list1;

    TextView txtMost_list1, txtRecom_list1;
    LinearLayout ln_list1;

    ////////////////////////////////

    public static Toolbar mToolbar;

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Gone
        ln_main = (LinearLayout) findViewById(R.id.ln_main);


        // List1

        gv_list1 = (GridView)findViewById(R.id.gv_item_list1);
        arrayList_list1 = new ArrayList<>();

        adapter_list1 = new Item_list1_Adapter(getApplicationContext(), R.layout.dong_layout_list_1, arrayList_list1);
        gv_list1.setAdapter(adapter_list1);

        GetList1(urlgetlist1);
        onClick();

        /////////////////////////////////////

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

                if (id == R.id.home_nav)
                {
                    android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.ftmain, new Fragment_Tablayout_List1());
                    ft.commit();
                    // Gone
                    ln_main.setVisibility(View.GONE);

//                    Toast.makeText(MainActivity.this,"My Profile", Toast.LENGTH_LONG).show();
                }
                if (id == R.id.list2_nav)
                {
                    android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.ftmain, new Fragment_Tablayout_List2());
                    ft.commit();

                    ln_main.setVisibility(View.GONE);


//                    Toast.makeText(MainActivity.this,"My news", Toast.LENGTH_LONG).show();
                }
                if (id == R.id.profile_nav)
                {
                    android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.ftmain, new Profile_Fragment());
                    ft.commit();

                    ln_main.setVisibility(View.GONE);

//                    Toast.makeText(MainActivity.this,"My bookmarks", Toast.LENGTH_LONG).show();
                }
                if (id == R.id.favourites_nav)
                {
                    android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.ftmain, new Fragment_Favourites());
                    ft.commit();
//                    Toast.makeText(MainActivity.this,"My offers", Toast.LENGTH_LONG).show();
                    ln_main.setVisibility(View.GONE);

                }
                if (id == R.id.newlist_nav)
                {
                    android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.ftmain, new Fragment_NewList());
                    ft.commit();

                    ln_main.setVisibility(View.GONE);

//                    Toast.makeText(MainActivity.this,"My orders", Toast.LENGTH_LONG).show();
                }
                if (id == R.id.newgird_nav)
                {
                    android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.ftmain, new Fragment_NewGrid());
                    ft.commit();

                    ln_main.setVisibility(View.GONE);
//                    Toast.makeText(MainActivity.this,"My payments", Toast.LENGTH_LONG).show();
                }
                if (id == R.id.comments)
                {
                    android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.ftmain, new Fragment_Comment());
                    ft.commit();

                    ln_main.setVisibility(View.GONE);
//                    Toast.makeText(MainActivity.this,"My comments", Toast.LENGTH_LONG).show();
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

    /////////////////////////////////////////////////////////////////

    // List1
    private void onClick() {
        txtMost_list1 = (TextView)findViewById(R.id.txt_Most_List1);
        txtRecom_list1 = (TextView)findViewById(R.id.txt_ReCom_List1);
        ln_list1 = (LinearLayout)findViewById(R.id.ln_list1);

        txtMost_list1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ln_list1.setVisibility(View.GONE);
                txtMost_list1.setBackgroundResource(R.drawable.background_list1);
                txtRecom_list1.setBackgroundResource(R.color.color_white);
            }
        });

        txtRecom_list1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ln_list1.setVisibility(View.VISIBLE);
                txtRecom_list1.setBackgroundResource(R.drawable.background_list1);
                txtMost_list1.setBackgroundResource(R.color.color_white);
            }
        });


    }

    private void GetList1(String urlgetlist1) {
        RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, urlgetlist1, null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        for (int i = 0; i < response.length(); i++) {
                            try {
                                JSONObject object_list1 = response.getJSONObject(i);
                                arrayList_list1.add(new Item_List1_Class(
                                        object_list1.getInt("ID"),
                                        object_list1.getString("Title"),
                                        object_list1.getString("Address"),
                                        object_list1.getString("ImgHinh")
                                ));
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                        adapter_list1.notifyDataSetChanged();
//                            Toast.makeText(getActivity(), response.toString(), Toast.LENGTH_SHORT).show();
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getApplicationContext(), "Lỗi", Toast.LENGTH_SHORT).show();
                    }
                }
        );
        requestQueue.add(jsonArrayRequest);
    }

    //////////////////////////////////////////////////////////////////

    //////////////////////////////////////////////////////////////////
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
//        int id = item.getItemId();
//        DisplaySelectedScreen(id);
//        return  true;
        return actionBarDrawerToggle.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }
}
