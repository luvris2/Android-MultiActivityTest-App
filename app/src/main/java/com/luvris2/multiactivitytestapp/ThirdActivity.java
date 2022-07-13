package com.luvris2.multiactivitytestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MyMultiple", "Third : onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MyMultiple", "Third : onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MyMultiple", "Third : onDestroy");
    }
}