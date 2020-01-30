package com.ditto.training.viewpagerwithtabs;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter{

    private static int count = 0;

    public static ViewPagerAdapter newInstance(FragmentManager fm,int numOfFragments){
        ViewPagerAdapter vP = new ViewPagerAdapter(fm);
        count = numOfFragments;
        return vP;
    }

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragmentku = null;
        position = position+1;
        return fragmentku;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Home";
            case 1:
                return "Favorite";
        }
        return null;
    }
}
