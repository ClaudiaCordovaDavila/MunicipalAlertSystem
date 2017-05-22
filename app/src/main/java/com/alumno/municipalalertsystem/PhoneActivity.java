package com.alumno.municipalalertsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PhoneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);

        ListView listView1 = (ListView) findViewById(R.id.list);

        String[] items = { "Fire Department                                           105", "Police Department                                      116", "Serenazgo                                               632-1300" };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, items);

        listView1.setAdapter(adapter);


    }
}
