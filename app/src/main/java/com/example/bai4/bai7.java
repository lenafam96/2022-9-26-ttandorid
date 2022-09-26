package com.example.bai4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class bai7 extends AppCompatActivity {
    private ListView list;
    private Button btn_bai7;
    private ListViewAdapter_bai7 adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai7);
        Init();
        Action();
    }

    private void Init() {
        btn_bai7 = (Button) this.findViewById(R.id.btn_bai7);
        list = (ListView) this.findViewById(R.id.listview_bai7);
        String[] country={"Apple","Banana","Litchi","Mango","PineApple"};
        int[] flag={R.drawable.apple,R.drawable.banana,R.drawable.litchi,R.drawable.mango,R.drawable.pineapple};
        adapter=new ListViewAdapter_bai7(this,country,flag);
        list.setAdapter(adapter);
    }

    private void Action() {
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                btn_bai7.setText(adapter.getName(position));
                Toast.makeText(bai7.this, adapter.getName(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}