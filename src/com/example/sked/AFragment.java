package com.example.sked;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class AFragment extends Fragment {

    @Override
    //Prilikom pokretanja funkcije, ubacujemo layout
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.afragment, container, false);
    }
    
    
}