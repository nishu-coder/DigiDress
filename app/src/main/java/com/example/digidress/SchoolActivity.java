package com.example.digidress;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class SchoolActivity extends AppCompatActivity  implements View.OnClickListener {

    ViewFlipper viewFlipper1;
    Button next1;
    Button previous1;
    Button size;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school);

        viewFlipper1 = (ViewFlipper) findViewById(R.id.school_view_flipper);
        next1 = (Button) findViewById(R.id.next1_school);
        previous1= (Button) findViewById(R.id.pre1_school);

        next1.setOnClickListener(this);
        previous1.setOnClickListener(this);

        size=findViewById(R.id.add_size_btn);
        size.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addIntent=new Intent(SchoolActivity.this,SizeActivity.class);
                startActivity(addIntent);
            }
        });

    }

    @Override
    public void onClick(View v) {
        if (v == next1) {
            viewFlipper1.showNext();
        } else if (v == previous1) {
            viewFlipper1.showPrevious();

        }
    }
}