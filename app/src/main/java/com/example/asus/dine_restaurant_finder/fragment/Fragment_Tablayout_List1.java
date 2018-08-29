package com.example.asus.dine_restaurant_finder.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.asus.dine_restaurant_finder.Adapter.Item_list1_Adapter;
import com.example.asus.dine_restaurant_finder.Event.Item_List1_Class;
import com.example.asus.dine_restaurant_finder.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Fragment_Tablayout_List1 extends Fragment {

    String urlgetlist1 = "http://192.168.1.227/ThucTap/getlist1.php";

    GridView gv_list1;

    ArrayList<Item_List1_Class> arrayList_list1;
    Item_list1_Adapter adapter_list1;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_layout_list1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("List 1");

        gv_list1 = (GridView)view.findViewById(R.id.gv_item_list1);
        arrayList_list1 = new ArrayList<>();

        adapter_list1 = new Item_list1_Adapter(getActivity(), R.layout.dong_layout_list_1, arrayList_list1);
        gv_list1.setAdapter(adapter_list1);

        GetList1(urlgetlist1);
    }

    private void GetList1(String urlgetlist1) {
        RequestQueue requestQueue = Volley.newRequestQueue(getActivity());
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
                        Toast.makeText(getActivity(), "Lỗi", Toast.LENGTH_SHORT).show();
                    }
                }
        );
        requestQueue.add(jsonArrayRequest);
    }
}
