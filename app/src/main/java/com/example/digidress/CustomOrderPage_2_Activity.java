package com.example.digidress;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class CustomOrderPage_2_Activity extends AppCompatActivity {
    private RadioGroup radioGroup1;
    Button onlinePayment;
    Button cash;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_order_page2);

        radioGroup1=findViewById(R.id.radio_group_delivery_method);
        onlinePayment=findViewById(R.id.online_payment);
        cash=findViewById(R.id.cash_payment);

        cash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CustomOrderPage_2_Activity.this, "Cash is selected", Toast.LENGTH_SHORT).show();
            }
        });

        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedButtonId) {
                switch (checkedButtonId){
                    case R.id.rb_option_a:
                        Toast.makeText(CustomOrderPage_2_Activity.this, "Self Pick is selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb_option_b:
                        Toast.makeText(CustomOrderPage_2_Activity.this, "Delivery by tailor side is selected", Toast.LENGTH_SHORT).show();
                        break;

                }

            }
        });

        onlinePayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://pmny.in/dIzbwuE14S8D");
            }
        });



    }

    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }

}