package com.example.mytablayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Tab2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab2);

        getSupportActionBar().hide();
    }
}