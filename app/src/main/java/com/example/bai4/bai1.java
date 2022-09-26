package com.example.bai4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Calendar;
import java.util.Date;

public class bai1 extends AppCompatActivity {
    private Button btnBai1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        Init();
        Action();
    }

    private void Action() {
        btnBai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Date currentTime = Calendar.getInstance().getTime();
                btnBai1.setText(currentTime.toString());
            }
        });
    }

    private void Init() {
        btnBai1 = (Button) this.findViewById(R.id.btnBai1);
    }
}