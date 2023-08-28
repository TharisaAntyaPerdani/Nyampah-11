package com.example.nyampah11;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Driver extends Fragment {


    public Driver() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview =  inflater.inflate(R.layout.fragment_driver, container, false);

        ImageView clickback3 = rootview.findViewById(R.id.kembaliClick3);

        clickback3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.flFragment, new ExploreFragment());
                fr.commit();
            }
        });

        TextView clickback4 = rootview.findViewById(R.id.kembaliClick4);

        clickback4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.flFragment, new ExploreFragment());
                fr.commit();
            }
        });
        return rootview;
    }
}