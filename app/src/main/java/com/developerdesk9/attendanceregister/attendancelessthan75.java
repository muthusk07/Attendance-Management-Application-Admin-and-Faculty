package com.developerdesk9.attendanceregister;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class attendancelessthan75 extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendancelessthan75);
        ArrayList<String> list=getIntent().getExtras().getStringArrayList("less");
        lv=findViewById(R.id.lessthan75);
        //android.R.layout.simple_list_item_1
        ArrayAdapter<String> ada=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                list);
        lv.setAdapter(ada);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });

    }
}
