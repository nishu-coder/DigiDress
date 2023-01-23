package com.example.digidress;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class PartyActivity extends AppCompatActivity implements View.OnClickListener {

    ViewFlipper viewFlipper3;
    Button next3;
    Button previous3;
    Button size;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_party);

        viewFlipper3=(ViewFlipper) findViewById(R.id.view_flipper_party);
        next3=(Button) findViewById(R.id.next3_party);
        previous3=(Button) findViewById(R.id.pre3_party);

        next3.setOnClickListener(this);
        previous3.setOnClickListener(this);

        size=findViewById(R.id.add_size_btn);
        size.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sizeIntent=new Intent(PartyActivity.this,SizeActivity.class);
                startActivity(sizeIntent);
            }
        });


    }

    @Override
    public void onClick(View v
    ) {
        if(v==next3){
            viewFlipper3.showNext();
        }else if(v==previous3){
            viewFlipper3.showPrevious();
        }

    }
}