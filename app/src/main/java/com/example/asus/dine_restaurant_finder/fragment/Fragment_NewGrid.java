package com.example.asus.dine_restaurant_finder.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.example.asus.dine_restaurant_finder.Adapter.New_Grid_Adapter;
import com.example.asus.dine_restaurant_finder.Event.NewGrid_Class;
import com.example.asus.dine_restaurant_finder.R;
import com.example.asus.dine_restaurant_finder.Server;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Fragment_NewGrid extends Fragment {

    String urlnewgrid = Server.NewGrid;
    GridView gv_newgrid;

    ArrayList<NewGrid_Class> arrayList_newgrid;
    New_Grid_Adapter adapter_newgrid;

    TextView txtMost_newgird, txtLatest_newgird;
    LinearLayout ln_newgrid;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_news_grid, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("New Gird");

        gv_newgrid = (GridView)view.findViewById(R.id.gv_new_grid);
        arrayList_newgrid = new ArrayList<>();

        adapter_newgrid = new New_Grid_Adapter(getActivity(), R.layout.dong_newgrid_list, arrayList_newgrid);
        gv_newgrid.setAdapter(adapter_newgrid);

        Getnewgird(urlnewgrid);
        onClick(view);
    }

    private void onClick(View view) {
        txtMost_newgird = (TextView)view.findViewById(R.id.txtMost_new_grid);
        txtLatest_newgird = (TextView)view.findViewById(R.id.txtLatest_new_grid);
        ln_newgrid = (LinearLayout)view.findViewById(R.id.ln_newgrid);

        txtMost_newgird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ln_newgrid.setVisibility(View.VISIBLE);
                txtMost_newgird.setBackgroundResource(R.drawable.background_list1);
                txtLatest_newgird.setBackgroundResource(R.color.color_white);
            }
        });

        txtLatest_newgird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ln_newgrid.setVisibility(View.GONE);
                txtLatest_newgird.setBackgroundResource(R.drawable.background_list1);
                txtMost_newgird.setBackgroundResource(R.color.color_white);
            }
        });


    }

    private void Getnewgird(String urlgetlist1) {
        RequestQueue requestQueue = Volley.newRequestQueue(getActivity());
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, urlgetlist1, null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        for (int i = 0; i < response.length(); i++) {
                            try {
                                JSONObject object_list1 = response.getJSONObject(i);
                                arrayList_newgrid.add(new NewGrid_Class(
                                        object_list1.getInt("ID"),
                                        object_list1.getString("Title"),
                                        object_list1.getString("Date"),
                                        object_list1.getString("Content"),
                                        object_list1.getString("Imghinh")
                                ));
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                        adapter_newgrid.notifyDataSetChanged();
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
