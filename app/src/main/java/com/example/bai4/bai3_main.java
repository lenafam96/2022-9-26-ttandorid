package com.example.bai4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class bai3_main extends AppCompatActivity {
    private Button btn_bai3_next,btn_bai3_back;
    private RadioGroup radioGroup_bai3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3_main);
        Init();
        Action();
    }

    private void Init() {
        btn_bai3_next = (Button) this.findViewById(R.id.btn_bai3_next);
        btn_bai3_back = (Button) this.findViewById(R.id.btn_bai3_back);
        radioGroup_bai3 = (RadioGroup) this.findViewById(R.id.radioGroup_bai3);
    }

    private void Action() {
        btn_bai3_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radioGroup_bai3.getCheckedRadioButtonId()==R.id.rad_bai3_1){
                    Intent intent = new Intent(bai3_main.this,bai2.class);
                    bai3_main.this.startActivity(intent);
                }
            }
        });
        btn_bai3_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bai3_main.this,MainActivity.class);
                bai3_main.this.startActivity(intent);
            }
        });
    }
}