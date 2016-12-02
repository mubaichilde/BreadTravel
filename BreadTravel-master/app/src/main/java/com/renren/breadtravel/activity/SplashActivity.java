package com.renren.breadtravel.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.renren.breadtravel.MainActivity;
import com.renren.breadtravel.R;


public class SplashActivity extends AppCompatActivity {

    Handler mHandler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences sp = getPreferences(MODE_PRIVATE);
                boolean isFirst = sp.getBoolean("isFirst",true);
                Intent intent = new Intent();
                if (isFirst){
                    sp.edit().putBoolean("isFirst",false).commit();
                    intent.setClass(SplashActivity.this,GuideActivity.class);
                }else{
                    intent.setClass(SplashActivity.this,MainActivity.class);
                }
                startActivity(intent);
            }
        },3000);

    }
}
