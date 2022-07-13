package com.luvris2.multiactivitytestapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        AlertDialog.Builder alert = new AlertDialog.Builder(SecondActivity.this);
        alert.setTitle("액티비티 이동");
        alert.setMessage("몇번째 액티비티로 이동하시겠습니까?");

        // 대화상자 'Yes' 이벤트, 액티비티 종료
        alert.setPositiveButton("세번째", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intentToThird = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intentToThird);
            }
        });

        // 대화상자 'No' 이벤트, Ok 문구 출력
        alert.setNegativeButton("첫번째", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intentToFirst = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intentToFirst);
            }
        });
        // 대화상자 버튼을 누르지 않으면 화면이 넘어가지 않게 설정
        alert.setCancelable(false);
        // 대화상자 화면에 표시
        alert.show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MyMultiple", "Second : onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MyMultiple", "Second : onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MyMultiple", "Second : onDestroy");
    }
}