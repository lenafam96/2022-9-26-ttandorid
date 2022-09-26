package com.example.bai4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class bai4 extends AppCompatActivity {
    private Button btn_bai4_pay;
    private RadioGroup radioGroup_bai4_1;
    private CheckBox Cream,Sugar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4);
        Init();
        Action();
    }

    private void Init() {
        btn_bai4_pay = (Button) this.findViewById(R.id.btn_bai4_pay);
        radioGroup_bai4_1 = (RadioGroup) this.findViewById(R.id.raidoGroup_bai4_1);
        Cream = (CheckBox) this.findViewById(R.id.Cream);
        Sugar = (CheckBox) this.findViewById(R.id.Sugar);
    }

    private void Action() {
        btn_bai4_pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioButtonID = radioGroup_bai4_1.getCheckedRadioButtonId();
                if(radioButtonID==-1){
                    String result = "Coffee" + (Cream.isChecked() ? " & cream" : "") + (Sugar.isChecked() ? " & sugar" : "");
                    Toast.makeText(bai4.this, result, Toast.LENGTH_LONG).show();
                }
                else {
                    RadioButton rd = (RadioButton) findViewById(radioButtonID);
                    String result = rd.getText().toString() + " Coffee" + (Cream.isChecked() ? " & cream" : "") + (Sugar.isChecked() ? " & sugar" : "");
                    Toast.makeText(bai4.this, result, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}