package com.example.asus.dine_restaurant_finder.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.asus.dine_restaurant_finder.Adapter.Comment_Adapter;
import com.example.asus.dine_restaurant_finder.Event.Comment_Class;
import com.example.asus.dine_restaurant_finder.R;
import com.example.asus.dine_restaurant_finder.Server;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Fragment_Comment extends Fragment {

    String urlgetcomment = Server.Comment;

    ListView lv_comment;
    ArrayList<Comment_Class> arrayList_comment;
    Comment_Adapter adapter_comment;

    TextView txtHelp_comment, txtBook_comment, txtCom_comment;
    ConstraintLayout constraintLayout_comment;
    ScrollView scrollView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_layout_comment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("Comment");

        lv_comment = (ListView)view.findViewById(R.id.lv_comment);
        arrayList_comment = new ArrayList<>();

        adapter_comment = new Comment_Adapter(getActivity(), R.layout.dong_comment_list, arrayList_comment);
        lv_comment.setAdapter(adapter_comment);

        getComment(urlgetcomment);
        
        onClick(view);
    }

    private void getComment(String urlgetcomment) {
        RequestQueue requestQueue = Volley.newRequestQueue(getActivity());
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, urlgetcomment, null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        for (int i = 0; i < response.length(); i++) {
                            try {
                                JSONObject object_list1 = response.getJSONObject(i);
                                arrayList_comment.add(new Comment_Class(
                                        object_list1.getInt("ID"),
                                        object_list1.getString("Name"),
                                        object_list1.getString("Hours"),
                                        object_list1.getString("Content")
                                ));
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                        adapter_comment.notifyDataSetChanged();
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

    private void onClick(View view) {
        txtBook_comment = (TextView)view.findViewById(R.id.txt_book_comment);
        txtCom_comment = (TextView)view.findViewById(R.id.txt_com_comment);
        txtHelp_comment = (TextView)view.findViewById(R.id.txt_help_comment);
        constraintLayout_comment = (ConstraintLayout)view.findViewById(R.id.contrai_comment);
        scrollView = (ScrollView)view.findViewById(R.id.scrollView_fragment_layout_comment);

        txtBook_comment.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {

                txtBook_comment.setTextColor(R.color.color_text_comment);
                txtHelp_comment.setTextColor(R.color.color_white);
                txtCom_comment.setTextColor(R.color.color_white);

                txtBook_comment.setBackgroundResource(R.color.color_white);
                txtCom_comment.setBackgroundResource(R.drawable.custom_layout_profile);
                txtHelp_comment.setBackgroundResource(R.drawable.custom_layout_profile);

                constraintLayout_comment.setVisibility(View.GONE);
                scrollView.setVisibility(View.GONE);
            }
        });

        txtHelp_comment.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                txtBook_comment.setTextColor(R.color.color_white);
                txtHelp_comment.setTextColor(R.color.color_text_comment);
                txtCom_comment.setTextColor(R.color.color_white);
                txtBook_comment.setBackgroundResource(R.drawable.custom_layout_profile);
                txtCom_comment.setBackgroundResource(R.drawable.custom_layout_profile);
                txtHelp_comment.setBackgroundResource(R.color.color_white);
                constraintLayout_comment.setVisibility(View.GONE);
                scrollView.setVisibility(View.VISIBLE);
            }
        });

        txtCom_comment.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                txtBook_comment.setTextColor(R.color.color_white);
                txtHelp_comment.setTextColor(R.color.color_white);
                txtCom_comment.setTextColor(R.color.color_text_comment);
                txtBook_comment.setBackgroundResource(R.drawable.custom_layout_profile);
                txtCom_comment.setBackgroundResource(R.color.color_white);
                txtHelp_comment.setBackgroundResource(R.drawable.custom_layout_profile);
                constraintLayout_comment.setVisibility(View.VISIBLE);
                scrollView.setVisibility(View.GONE);
            }
        });
    }
}
