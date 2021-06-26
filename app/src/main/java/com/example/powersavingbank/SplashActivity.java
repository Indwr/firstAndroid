package com.example.powersavingbank;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;

import android.os.Bundle;

import android.os.Handler;
import android.os.Looper;
import android.view.Window;

import android.view.WindowManager;


public class SplashActivity extends AppCompatActivity {


    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        Window window = getWindow() ;


        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);



        new Handler(Looper.myLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));

                finish();
            }
        },3000);

//        Thread splashTread = new Thread(){
//
//
//            @Override
//
//            public void run() {
//
//                try {
//
//                    sleep(3000);
//
//                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
//
//                    finish();
//
//                } catch (InterruptedException e) {
//
//                    e.printStackTrace();
//
//                }
//
//
//                super.run();
//
//            }
//
//        };


//        splashTread.start();





    }


}