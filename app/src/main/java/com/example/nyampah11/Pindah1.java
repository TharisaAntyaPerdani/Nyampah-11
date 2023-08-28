package com.example.nyampah11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pindah1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pindah1);
    }

    public void createakun(View view) {
        Intent intent = new Intent(Pindah1.this,CreateAkun.class);
        startActivity(intent);
    }

    public void google(View view) {
        Intent intent = new Intent(Pindah1.this,ContinueGoogle.class);
        startActivity(intent);
    }
}