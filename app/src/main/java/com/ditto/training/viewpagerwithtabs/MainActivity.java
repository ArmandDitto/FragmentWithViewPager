package com.ditto.training.viewpagerwithtabs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPagerku;
    private ViewPagerAdapter viewPagerAdapterku;
    private TabLayout tabLayoutku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> data = new ArrayList<>();
        data.add("Dittoons");
        data.add("Favourite");
        data.add("Genre");
        data.add("Downloads");
        data.add("Popular");
        data.add("Create Ur Oun");

        viewPagerku = findViewById(R.id.view_pager);
        viewPagerAdapterku = ViewPagerAdapter.newInstance(getSupportFragmentManager(),data);
        viewPagerku.setAdapter(viewPagerAdapterku  );

        tabLayoutku = findViewById(R.id.tab_ku);
        tabLayoutku.setupWithViewPager(viewPagerku);
    }
}
