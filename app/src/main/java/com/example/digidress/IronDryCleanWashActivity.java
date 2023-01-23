package com.example.digidress;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IronDryCleanWashActivity extends AppCompatActivity {

    Button nextPageDailyServices;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iron_dry_clean_wash);

        nextPageDailyServices=findViewById(R.id.nextBtnNextPage_dailyServices);
        nextPageDailyServices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextPageDailyIntent=new Intent(IronDryCleanWashActivity.this,CustomOrderPage_2_Activity.class);
                startActivity(nextPageDailyIntent);
            }
        });

    }
}