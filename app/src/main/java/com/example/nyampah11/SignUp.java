package com.example.nyampah11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void button3 (View view) {
        Intent intent = new Intent(SignUp.this,HomeScreen.class);
        startActivity(intent);
    }
}