package com.ditto.training.viewpagerwithtabs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPagerku;
    private ViewPagerAdapter viewPagerAdapterku;
    private TabLayout tabLayoutku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPagerku = findViewById(R.id.view_pager);
        viewPagerAdapterku = ViewPagerAdapter.newInstance(getSupportFragmentManager(),2);
        viewPagerku.setAdapter(viewPagerAdapterku  );

        tabLayoutku = findViewById(R.id.tab_ku);
        tabLayoutku.setupWithViewPager(viewPagerku);
    }
}
