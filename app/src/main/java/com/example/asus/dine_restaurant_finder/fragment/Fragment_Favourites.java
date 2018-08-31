package com.example.asus.dine_restaurant_finder.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.asus.dine_restaurant_finder.Adapter.Favourites_Adapter;
import com.example.asus.dine_restaurant_finder.Event.Favourites_Class;
import com.example.asus.dine_restaurant_finder.R;
import com.example.asus.dine_restaurant_finder.Server;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Fragment_Favourites extends Fragment {

//    String urlgetfavourites = "http://192.168.1.227/ThucTap/getfavourites.php";
        String urlgetfavourites = Server.Favourites;

    ListView lv_favourites;
    ArrayList<Favourites_Class> arrayList_favourites;
    Favourites_Adapter adapter_favourites;

    TextView txtSave, txtFavourites, txtHistory, txtFollowing, txtLogout;
    LinearLayout ln_favourites;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_favourites, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("Favourites");

        lv_favourites = (ListView)view.findViewById(R.id.lv_favouirites);
        arrayList_favourites = new ArrayList<>();

        adapter_favourites = new Favourites_Adapter(getActivity(), R.layout.dong_favourites_list, arrayList_favourites);
        lv_favourites.setAdapter(adapter_favourites);

        getFavourites(urlgetfavourites);
        onClick(view);
    }

    private void onClick(View view) {
        txtSave = (TextView)view.findViewById(R.id.txt_save_favourites);
        txtFavourites = (TextView)view.findViewById(R.id.txt_favourites_favourites);
        txtHistory = (TextView)view.findViewById(R.id.txt_history_favourites);
        txtFollowing = (TextView)view.findViewById(R.id.txt_following_favourites);
        txtLogout = (TextView)view.findViewById(R.id.txt_logout_favourites);

        ln_favourites = (LinearLayout)view.findViewById(R.id.ln_favourites);

        txtSave.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {

                ln_favourites.setVisibility(View.GONE);
                txtSave.setBackgroundResource(R.color.color_ChuDao);
                txtFavourites.setBackgroundResource(R.color.colorBackground_custom1);
                txtFollowing.setBackgroundResource(R.color.colorBackground_custom1);
                txtHistory.setBackgroundResource(R.color.colorBackground_custom1);
                txtLogout.setBackgroundResource(R.color.colorBackground_custom1);
            }
        });

        txtFavourites.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                ln_favourites.setVisibility(View.VISIBLE);
                txtSave.setBackgroundResource(R.color.colorBackground_custom1);
                txtFavourites.setBackgroundResource(R.color.color_ChuDao);
                txtFollowing.setBackgroundResource(R.color.colorBackground_custom1);
                txtHistory.setBackgroundResource(R.color.colorBackground_custom1);
                txtLogout.setBackgroundResource(R.color.colorBackground_custom1);
            }
        });

        txtHistory.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                ln_favourites.setVisibility(View.GONE);
                txtSave.setBackgroundResource(R.color.colorBackground_custom1);
                txtFavourites.setBackgroundResource(R.color.colorBackground_custom1);
                txtFollowing.setBackgroundResource(R.color.colorBackground_custom1);
                txtHistory.setBackgroundResource(R.color.color_ChuDao);
                txtLogout.setBackgroundResource(R.color.colorBackground_custom1);
            }
        });

        txtFollowing.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                ln_favourites.setVisibility(View.GONE);
                txtSave.setBackgroundResource(R.color.colorBackground_custom1);
                txtFavourites.setBackgroundResource(R.color.colorBackground_custom1);
                txtFollowing.setBackgroundResource(R.color.color_ChuDao);
                txtHistory.setBackgroundResource(R.color.colorBackground_custom1);
                txtLogout.setBackgroundResource(R.color.colorBackground_custom1);
            }
        });

        txtLogout.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                ln_favourites.setVisibility(View.GONE);
                txtSave.setBackgroundResource(R.color.colorBackground_custom1);
                txtFavourites.setBackgroundResource(R.color.colorBackground_custom1);
                txtFollowing.setBackgroundResource(R.color.colorBackground_custom1);
                txtHistory.setBackgroundResource(R.color.colorBackground_custom1);
                txtLogout.setBackgroundResource(R.color.color_ChuDao);
            }
        });
    }

    private void getFavourites(String urlgetfavourites) {
        RequestQueue requestQueue = Volley.newRequestQueue(getActivity());
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, urlgetfavourites, null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        for (int i = 0; i < response.length(); i++) {
                            try {
                                JSONObject object_list1 = response.getJSONObject(i);
                                arrayList_favourites.add(new Favourites_Class(
                                        object_list1.getInt("ID"),
                                        object_list1.getString("Title"),
                                        object_list1.getString("Content"),
                                        object_list1.getString("imghinh")
                                ));
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                        adapter_favourites.notifyDataSetChanged();
//                            Toast.makeText(getActivity(), response.toString(), Toast.LENGTH_SHORT).show();
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getActivity(), "Lỗi", Toast.LENGTH_SHORT).show();
                    }
                }
        );
        requestQueue.add(jsonArrayRequest);
    }
}
