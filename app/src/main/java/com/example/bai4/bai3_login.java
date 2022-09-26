package com.example.bai4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class bai3_login extends AppCompatActivity {
    private Button btn_bai3_login,btn_bai3_close;
    private EditText input_bai3_username,input_bai3_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3_login);
        Init();
        Action();
    }

    private void Init() {
        btn_bai3_login = (Button) this.findViewById(R.id.btn_bai3_login);
        btn_bai3_close = (Button) this.findViewById(R.id.btn_bai3_close);
        input_bai3_username = (EditText) this.findViewById(R.id.input_bai3_username);
        input_bai3_password = (EditText) this.findViewById(R.id.input_bai3_password);
    }

    private void Action() {
        btn_bai3_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input_bai3_username.getText().toString().equals("CNTT") && input_bai3_password.getText().toString().equals("UNETI")){
                    Intent intent = new Intent(bai3_login.this,bai3_main.class);
                    bai3_login.this.startActivity(intent);
                }
                else
                    Toast.makeText(bai3_login.this, "Tên đăng nhập/mật khẩu không đúng!", Toast.LENGTH_LONG).show();
            }
        });
        btn_bai3_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bai3_login.this,MainActivity.class);
                bai3_login.this.startActivity(intent);
            }
        });
    }
}