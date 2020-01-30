package com.ditto.training.viewpagerwithtabs;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter{

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        HomeFragment homeFragmentku = new HomeFragment();
        FavoriteFragment favoriteFragmentku = new FavoriteFragment();
        position=position+1;
        Bundle bundleku = new Bundle();

        bundleku.putString("Message", "Fragment Ke: " +position);
        homeFragmentku.setArguments(bundleku);
        return homeFragmentku;
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position += 1;

        return "Tab " +position;
    }
}
