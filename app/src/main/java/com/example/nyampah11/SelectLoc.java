package com.example.nyampah11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class SelectLoc extends AppCompatActivity {

    Spinner spinner1;
    TextView selection1;
    String [] item = {"Palembang","Sekitar Palembang"};

    Spinner spinner2;
    TextView selection2;
    String [] item2 = {"Talang Kelapa","Kenten","Bukit Besak","Plaju","Demang","Jakabaring","Lemabang"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_loc);

        selection1 = (TextView)findViewById(R.id.selection1);
        spinner1 = (Spinner)findViewById(R.id.spinner1);

        selection2 = (TextView)findViewById(R.id.selection2);
        spinner2 = (Spinner)findViewById(R.id.spinner2);

        ArrayAdapter<String> aa1 = new
                ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,item);
        aa1.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner1.setAdapter(aa1);

        ArrayAdapter<String> aa2 = new
                ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,item2);
        aa2.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner2.setAdapter(aa2);

    }

    public void button2(View view) {
        Intent intent = new Intent(SelectLoc.this,SignUp.class);
        startActivity(intent);
    }
}