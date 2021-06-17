package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class FragmentB extends Fragment {
    EditText name_et,school_et;
    Button get_btn;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        ViewGroup viewGroup = (ViewGroup)inflater.inflate(R.layout.fragment_b,container,false);

        name_et = (EditText)viewGroup.findViewById(R.id.name_edit);
        school_et = (EditText)viewGroup.findViewById(R.id.school_edit);
        get_btn = (Button)viewGroup.findViewById(R.id.send_btn);

        get_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                String name, school;

                name = name_et.getText().toString();
                school = school_et.getText().toString();

                bundle.putString("Name", name);
                bundle.putString("School",school);

                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

                FragmentC fragmentc = new FragmentC();
                fragmentc.setArguments(bundle);
                transaction.replace(R.id.fragmentBorC,fragmentc);
                transaction.commit();
            }
        });
        return viewGroup;
    }
}

}
