package com.dicoding.picodiploma.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move);

        if(getIntent()!=null){
            TextView tvData1 = (TextView) findViewById(R.id.tv_data1);
            TextView tvData2 = (TextView) findViewById(R.id.tv_data2);

            tvData1.setText(getIntent().getStringExtra("data1"));
            tvData2.setText(getIntent().getStringExtra("data2"));
        }
    }
}