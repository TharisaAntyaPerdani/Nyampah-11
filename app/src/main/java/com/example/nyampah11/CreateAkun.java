package com.example.nyampah11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CreateAkun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_akun);
    }

    public void grup3(View view) {
        Intent intent = new Intent(CreateAkun.this,SelectLoc.class);
        startActivity(intent);
    }
}