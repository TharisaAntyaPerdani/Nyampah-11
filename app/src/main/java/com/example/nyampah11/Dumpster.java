package com.example.nyampah11;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Dumpster extends Fragment {

    public Dumpster() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview =  inflater.inflate(R.layout.fragment_dumpster, container, false);

        ImageView clickback1 = rootview.findViewById(R.id.kembaliClick1);

        clickback1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.flFragment, new ExploreFragment());
                fr.commit();
            }
        });

        TextView clickback2 = rootview.findViewById(R.id.kembaliClick2);

        clickback2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.flFragment, new ExploreFragment());
                fr.commit();
            }
        });

        ImageView explainsukawinatan = rootview.findViewById(R.id.tpasukawinatan);

        explainsukawinatan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.flFragment, new ExplainDumpster1());
                fr.commit();
            }
        });
        return rootview;
    }
}