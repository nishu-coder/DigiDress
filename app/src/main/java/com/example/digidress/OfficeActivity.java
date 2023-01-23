package com.example.digidress;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class OfficeActivity extends AppCompatActivity implements View.OnClickListener {

    ViewFlipper viewFlipper2;
    Button next2;
    Button previous2;
    Button size;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_office);

        viewFlipper2 =(ViewFlipper) findViewById(R.id.view_flipper_office);
        next2=(Button) findViewById(R.id.next2_office);
        previous2=(Button) findViewById(R.id.pre2_office);

        next2.setOnClickListener(this);
        previous2.setOnClickListener(this);

        size=findViewById(R.id.add_size_btn);
        size.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sizeIntent=new Intent(OfficeActivity.this,SizeActivity.class);
                startActivity(sizeIntent);
            }
        });

    }

    @Override
    public void onClick(View v) {
        if(v==next2){
            viewFlipper2.showNext();
        } else if( v ==previous2){
            viewFlipper2.showPrevious();
        }
    }
}