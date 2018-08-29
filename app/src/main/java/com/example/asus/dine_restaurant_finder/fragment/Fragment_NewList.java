package com.example.asus.dine_restaurant_finder.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.asus.dine_restaurant_finder.Adapter.NewList_Adapter;
import com.example.asus.dine_restaurant_finder.Event.NewList;
import com.example.asus.dine_restaurant_finder.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Administrator on 24/08/2018.
 */

public class Fragment_NewList extends Fragment {


    String urlgetnewlist = "http://192.168.1.227/ThucTap/getnewlist.php";

    ListView lv_NewList;
    ArrayList<NewList> arrayList;
    NewList_Adapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_new_list, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("News");


        lv_NewList = (ListView) view.findViewById(R.id.lv_newlist);
        arrayList = new ArrayList<>();

        adapter = new NewList_Adapter(getActivity(), R.layout.dong_new_list, arrayList);
        lv_NewList.setAdapter(adapter);

        GetData(urlgetnewlist);
    }

    private void GetData(String urlnewlist){
        RequestQueue requestQueue = Volley.newRequestQueue(getActivity());
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, urlnewlist, null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        for (int i = 0; i< response.length(); i++){
                            try {
                                JSONObject object = response.getJSONObject(i);
                                arrayList.add(new NewList(
                                   object.getInt("Id"),
                                        object.getString("Title"),
                                        object.getString("Date"),
                                        object.getString("Content"),
                                        object.getString("Img")
                                ));
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                        adapter.notifyDataSetChanged();
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getActivity(),"Lỗi", Toast.LENGTH_LONG).show();
                    }
                }
        );
        requestQueue.add(jsonArrayRequest);
    }

}
