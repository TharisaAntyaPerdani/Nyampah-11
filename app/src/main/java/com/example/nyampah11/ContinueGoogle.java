package com.example.nyampah11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ContinueGoogle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continue_google);
    }

    public void button(View view) {
        Intent intent = new Intent(ContinueGoogle.this,HomeScreen.class);
        startActivity(intent);
    }
}