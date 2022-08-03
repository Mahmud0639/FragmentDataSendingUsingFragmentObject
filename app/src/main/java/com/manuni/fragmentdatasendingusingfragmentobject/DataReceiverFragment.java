package com.manuni.fragmentdatasendingusingfragmentobject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class DataReceiverFragment extends Fragment {
    private String name, age;




    public DataReceiverFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_data_receiver, container, false);
        TextView fragTxt = view.findViewById(R.id.nameTxt);
        fragTxt.setText(name);
        TextView ageTxt = view.findViewById(R.id.ageTxt);
        ageTxt.setText(age);


        return view;
    }
    public void setFragmentData(String name, String age){
        this.name = name;
        this.age = age;
    }
}