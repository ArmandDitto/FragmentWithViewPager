package com.ditto.training.viewpagerwithtabs;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentPagerAdapter{

    private static int count = 0;
    private static ArrayList<String> myData;


    public static ViewPagerAdapter newInstance(FragmentManager fm, ArrayList data){
        ViewPagerAdapter vP = new ViewPagerAdapter(fm);
        myData = data;
        count = data.size();
        return vP;
    }

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragmentku = null;
        if(myData.get(position).equals("Favourite")){
            fragmentku = new FavoriteFragment();
        }
        else{
           fragmentku = HomeFragment.newInstance(position,myData.get(position));
        }

        return fragmentku;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return myData.get(position);
    }
}
