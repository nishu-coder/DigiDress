package com.example.digidress;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserSelectFinalActivity extends AppCompatActivity {

    private Button user;
    private Button tailor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_select_final);

        user=findViewById(R.id.signup_as_user_btn_page_2);
        tailor=findViewById(R.id.signup_as_tailor_btn_page2);

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(UserSelectFinalActivity.this,ServicesMainActivity.class);
                startActivity(intent);

            }
        });

        tailor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(UserSelectFinalActivity.this,TailorDashboardFinalActivity.class);
                startActivity(intent);

            }
        });
    }
}