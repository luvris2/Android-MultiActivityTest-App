package com.luvris2.multiactivitytestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);

            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MyMultiple", "Main : onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MyMultiple", "Main : onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MyMultiple", "Main : onDestroy");
    }
}