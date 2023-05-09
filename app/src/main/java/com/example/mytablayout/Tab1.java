package com.example.mytablayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Tab1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab1);

        getSupportActionBar().hide();
    }
}