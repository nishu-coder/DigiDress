package com.example.digidress;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SizeActivity extends AppCompatActivity {
    private RadioGroup radioGroup2;
    private Button nextPage;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_size);

        radioGroup2=findViewById(R.id.radio_group_size);
        nextPage=findViewById(R.id.nextPageBtnSize_Stiching);

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextPageIntent=new Intent(SizeActivity.this,CustomOrderPage_2_Activity.class);
                startActivity(nextPageIntent);
            }
        });

        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedButtonId) {
                switch (checkedButtonId){
                    case R.id.rb_xxxs_option_a:
                        Toast.makeText(SizeActivity.this, "XXXS size is selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb_xxs_option_b:
                        Toast.makeText(SizeActivity.this, "XXS size is selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb_xs_option_c:
                        Toast.makeText(SizeActivity.this, "XS size is selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb_s_option_d:
                        Toast.makeText(SizeActivity.this, "S size is selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb_m_option_e:
                        Toast.makeText(SizeActivity.this, "M size is selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb_sm_option_f:
                        Toast.makeText(SizeActivity.this, "SM size is selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb_l_option_g:
                        Toast.makeText(SizeActivity.this, "L size is selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb_xl_option_h:
                        Toast.makeText(SizeActivity.this, "XL size is selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb_xxl_option_i:
                        Toast.makeText(SizeActivity.this, "XXL size is selected", Toast.LENGTH_SHORT).show();
                        break;
                }

            }
        });
    }
}