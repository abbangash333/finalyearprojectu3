package com.example.finalyearprojectuser.homeSearchAndNotification.homeButtomNavigation;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.finalyearprojectuser.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_bottom_missing_posts extends Fragment {
   FloatingActionButton homeFloatingActionBtn;

    public Fragment_bottom_missing_posts() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_bottom_missing_posts, container, false);

    }

}
