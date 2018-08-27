package com.example.asus.dine_restaurant_finder;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.example.asus.dine_restaurant_finder.Activity.SignUp_Activity;
import com.example.asus.dine_restaurant_finder.Activity.Signin_Activity;

public class Startup extends AppCompatActivity {

    MainActivity mainActivity;
    Button btnLogin, btnRegis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);

        initControl();
        initEvent();


        ControllStatusbar();
//        ControllActionbar();


    }

    private void initEvent() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Startup.this, Signin_Activity.class);
                startActivity(it);
            }
        });

        btnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it1 = new Intent(Startup.this, SignUp_Activity.class);
                startActivity(it1);
            }
        });
    }

    private void initControl() {
        btnLogin = (Button) findViewById(R.id.btnLogin_Dine);
        btnRegis = (Button)findViewById(R.id.btnRegister_Dine);
    }

    private void ControllStatusbar(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow(); // in Activity's onCreate() for instance
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
    }
//    private void ControllActionbar(){
//        getSupportActionBar().hide();
//    }
}
