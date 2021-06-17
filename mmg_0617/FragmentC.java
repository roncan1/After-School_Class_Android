package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class FragmentC extends Fragment {
    TextView name_T,school_T;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        ViewGroup viewGroup = (ViewGroup)inflater.inflate(R.layout.fragment_c,container,false);

        String name, school;

        name_T = (TextView)viewGroup.findViewById(R.id.name_text);
        school_T = (TextView)viewGroup.findViewById(R.id.school_text);

        name = getArguments().getString("Name");
        school= getArguments().getString("School");

        name_T.setText(name);
        school_T.setText(school);

        return viewGroup;
    }
}
