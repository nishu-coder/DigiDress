package com.example.digidress;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class ServicesMainActivity extends AppCompatActivity {
    TabLayout tab_one;
    ViewPager viewPager_one;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services_main);

        tab_one=findViewById(R.id.tab_one);
        viewPager_one=findViewById(R.id.viewPager_one);

        ViewPagerMessangerAdapter adapter = new ViewPagerMessangerAdapter(getSupportFragmentManager());
        viewPager_one.setAdapter(adapter);

        tab_one.setupWithViewPager(viewPager_one);



    }
}