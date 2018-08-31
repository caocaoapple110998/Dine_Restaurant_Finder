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
import com.example.asus.dine_restaurant_finder.Adapter.Item_list2_Adapter;
import com.example.asus.dine_restaurant_finder.Event.Item_list2_Class;
import com.example.asus.dine_restaurant_finder.R;
import com.example.asus.dine_restaurant_finder.Server;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Fragment_Tablayout_List2 extends Fragment {

    GridView gv_list2;

//    String urlgetlist2 = "http://192.168.1.227/ThucTap/getlist2.php";
    String urlgetlist2 = Server.List2;

    ArrayList<Item_list2_Class> arrayList_list2;
    Item_list2_Adapter adapter_list2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_layout_list_2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

            getActivity().setTitle("Restaurant List 2");

        gv_list2 = (GridView) view.findViewById(R.id.girdview_fragment_layout_list_2);
        arrayList_list2 = new ArrayList<>();

        adapter_list2 = new Item_list2_Adapter(getActivity(), R.layout.dong_layout_list_2, arrayList_list2);
        gv_list2.setAdapter(adapter_list2);

        GetList2(urlgetlist2);
    }

    private void GetList2(String urlgetlist2) {
        RequestQueue requestQueue = Volley.newRequestQueue(getActivity());
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, urlgetlist2, null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        for (int i = 0; i<response.length();i++){
                            try {
                                JSONObject object_list2 = response.getJSONObject(i);
                                arrayList_list2.add(new Item_list2_Class(
                                        object_list2.getInt("ID"),
                                        object_list2.getString("Rating"),
                                        object_list2.getString("Name"),
                                        object_list2.getString("Address"),
                                        object_list2.getString("Foods"),
                                        object_list2.getString("Price"),
                                        object_list2.getString("Save"),
                                        object_list2.getString("Old_price"),
                                        object_list2.getString("Date"),
                                        object_list2.getString("Imghinh")
                                ));
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                        adapter_list2.notifyDataSetChanged();
  //                      Toast.makeText(getActivity(), response.toString(), Toast.LENGTH_SHORT).show();
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
