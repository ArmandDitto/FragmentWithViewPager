package com.ditto.training.viewpagerwithtabs;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private TextView tvFragment;
    public HomeFragment() {
        // Required empty public constructor
    }

    public static HomeFragment newInstance(int pos,String title){
        HomeFragment homeFragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putInt("position",pos);
        args.putString("title",title);
        homeFragment.setArguments(args);
        return homeFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        tvFragment = view.findViewById(R.id.tv_home);
        //tvFragment.setText(String.valueOf(getArguments().getInt("position")));
        tvFragment.setText(getArguments().getString("title"));
        return view;
    }

}
