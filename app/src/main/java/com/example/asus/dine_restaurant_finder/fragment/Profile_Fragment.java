package com.example.asus.dine_restaurant_finder.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.asus.dine_restaurant_finder.R;

/**
 * Created by Administrator on 21/08/2018.
 */

public class Profile_Fragment extends Fragment {

    TextView txtDetail_profile, txtGallary_profile, txtHistory_profile, txtPayment_profile, txtLogout_profile;
    ConstraintLayout contrai_profile;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("Profile");

        contrai_profile = (ConstraintLayout)view.findViewById(R.id.contrai_profile) ;

        txtDetail_profile = (TextView)view.findViewById(R.id.txtdetail_fragment_profile);
        txtGallary_profile = (TextView)view.findViewById(R.id.txtgallary_fragment_profile);
        txtPayment_profile = (TextView)view.findViewById(R.id.txtpayments_fragment_profile);
        txtHistory_profile = (TextView)view.findViewById(R.id.txthistory_fragment_profile);
        txtLogout_profile = (TextView)view.findViewById(R.id.txtlogout_fragment_profile);

        txtDetail_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contrai_profile.setVisibility(View.GONE);

                txtDetail_profile.setBackgroundResource(R.color.color_text_profile_gallary);
                txtGallary_profile.setBackgroundResource(R.color.color_text_profile);
                txtPayment_profile.setBackgroundResource(R.color.color_text_profile);
                txtHistory_profile.setBackgroundResource(R.color.color_text_profile);
                txtLogout_profile.setBackgroundResource(R.color.color_text_profile);
            }
        });

        txtLogout_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contrai_profile.setVisibility(View.GONE);

                txtDetail_profile.setBackgroundResource(R.color.color_text_profile);
                txtGallary_profile.setBackgroundResource(R.color.color_text_profile);
                txtPayment_profile.setBackgroundResource(R.color.color_text_profile);
                txtHistory_profile.setBackgroundResource(R.color.color_text_profile);
                txtLogout_profile.setBackgroundResource(R.color.color_text_profile_gallary);
            }
        });

        txtPayment_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contrai_profile.setVisibility(View.GONE);

                txtDetail_profile.setBackgroundResource(R.color.color_text_profile);
                txtGallary_profile.setBackgroundResource(R.color.color_text_profile);
                txtPayment_profile.setBackgroundResource(R.color.color_text_profile_gallary);
                txtHistory_profile.setBackgroundResource(R.color.color_text_profile);
                txtLogout_profile.setBackgroundResource(R.color.color_text_profile);
            }
        });

        txtGallary_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contrai_profile.setVisibility(View.VISIBLE);

                txtDetail_profile.setBackgroundResource(R.color.color_text_profile);
                txtGallary_profile.setBackgroundResource(R.color.color_text_profile_gallary);
                txtPayment_profile.setBackgroundResource(R.color.color_text_profile);
                txtHistory_profile.setBackgroundResource(R.color.color_text_profile);
                txtLogout_profile.setBackgroundResource(R.color.color_text_profile);
            }
        });

        txtHistory_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contrai_profile.setVisibility(View.GONE);

                txtDetail_profile.setBackgroundResource(R.color.color_text_profile);
                txtGallary_profile.setBackgroundResource(R.color.color_text_profile);
                txtPayment_profile.setBackgroundResource(R.color.color_text_profile);
                txtHistory_profile.setBackgroundResource(R.color.color_text_profile_gallary);
                txtLogout_profile.setBackgroundResource(R.color.color_text_profile);
            }
        });

    }
}
