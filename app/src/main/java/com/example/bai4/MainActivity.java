package com.example.bai4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private Button bai1,bai2,bai3,bai4,bai5,bai6,bai7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();
        Action();
    }

    private void Action() {
        bai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,bai1.class);
                MainActivity.this.startActivity(intent);
            }
        });
        bai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,bai2.class);
                MainActivity.this.startActivity(intent);
            }
        });
        bai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,bai3_login.class);
                MainActivity.this.startActivity(intent);
            }
        });
        bai4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,bai4.class);
                MainActivity.this.startActivity(intent);
            }
        });
        bai5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,bai5.class);
                MainActivity.this.startActivity(intent);
            }
        });
        bai6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,bai6.class);
                MainActivity.this.startActivity(intent);
            }
        });
        bai7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,bai7.class);
                MainActivity.this.startActivity(intent);
            }
        });
    }

    private void Init() {
        bai1 = (Button) this.findViewById(R.id.bai1);
        bai2 = (Button) this.findViewById(R.id.bai2);
        bai3 = (Button) this.findViewById(R.id.bai3);
        bai4 = (Button) this.findViewById(R.id.bai4);
        bai5 = (Button) this.findViewById(R.id.bai5);
        bai6 = (Button) this.findViewById(R.id.bai6);
        bai7 = (Button) this.findViewById(R.id.bai7);
    }
}