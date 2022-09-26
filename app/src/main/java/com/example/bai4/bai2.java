package com.example.bai4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class bai2 extends AppCompatActivity {
    private Button btn_bai2_giai,btn_bai2_xoa;
    private EditText input_bai2_a,input_bai2_b,input_bai2_c,output_bai2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        Init();
        Action();
    }

    private void Init() {
        btn_bai2_giai = (Button) this.findViewById(R.id.btn_bai2_giai);
        btn_bai2_xoa = (Button) this.findViewById(R.id.btn_bai2_xoa);
        input_bai2_a = (EditText) this.findViewById(R.id.input_bai2_a);
        input_bai2_b = (EditText) this.findViewById(R.id.input_bai2_b);
        input_bai2_c = (EditText) this.findViewById(R.id.input_bai2_c);
        output_bai2 = (EditText) this.findViewById(R.id.output_bai2);
    }

    private void Action() {
        btn_bai2_giai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a = Float.parseFloat(input_bai2_a.getText().toString());
                float b = Float.parseFloat(input_bai2_b.getText().toString());
                float c = Float.parseFloat(input_bai2_c.getText().toString());
                String resutl = "";
                if(a==0)
                    resutl = "Không phải phương trình bậc hai";
                else{
                    float delta = b*b - 4*a*c;
                    if(delta<0)
                        resutl = String.format("Phương trình %.2fx^2 %s %.2fx %s c = 0 vô nghiệm thực",a,b>=0?"+":"-",b,c>=0?"+":"-",c);
                    else if(delta==0)
                        resutl = String.format("Phương trình %.2fx^2 %s %.2fx %s c = 0 có nghiệm kép x = %.2f",a,b>=0?"+":"-",b,c>=0?"+":"-",c,(-b/(2*a)));
                    else
                        resutl = String.format("Phương trình %.2fx^2 %s %.2fx %s c = 0 có nghiệm x1 = %.2f và x2 = %.2f",a,b>=0?"+":"-",b,c>=0?"+":"-",c,((-b+Math.sqrt(delta))/(2*a)),((-b-Math.sqrt(delta))/(2*a)));
                }
                output_bai2.setText(resutl);
            }
        });

        btn_bai2_xoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_bai2_a.setText("");
                input_bai2_b.setText("");
                input_bai2_c.setText("");
                output_bai2.setText("");
            }
        });
    }
}