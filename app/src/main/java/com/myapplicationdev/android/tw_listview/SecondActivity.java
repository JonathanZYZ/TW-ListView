package com.myapplicationdev.android.tw_listview;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvYear;
    ArrayList<Module> al;

    ArrayAdapter<Module> aa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) this.findViewById(R.id.lvModules);
        tvYear = (TextView) findViewById(R.id.tvYear);

        Intent intent = getIntent();
        int text = intent.getIntExtra("YEAR", 0);




        al = new ArrayList<Module>();

        if(text == 0){
            tvYear.setText("Year 1");
        }
        else if(text == 1){
            tvYear.setText("Year 2");
            al.add(new Module(true,"C208"));
            al.add(new Module(false,"C200"));
            al.add(new Module(true,"C346"));
        }
        else if(text == 2){
            tvYear.setText("Year 3");
        }

        aa = new ModuleAdapter(this,R.layout.secondrow,al);
        lv.setAdapter(aa);


    }



}
