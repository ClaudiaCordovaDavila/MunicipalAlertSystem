package com.alumno.municipalalertsystem;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class PhoneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);

       final  ListView listView1 = (ListView) findViewById(R.id.list);

        String[] items = { "Fire Department                                           105", "Police Department                                      116", "Serenazgo                                               632-1300" };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, items);

        listView1.setAdapter(adapter);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public static final int REQUEST_CALL_PHONE = 1 ;

            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Object o = listView1.getItemAtPosition(position);

                Log.i("------->",  "" + position);


                int checkPermission = ContextCompat.checkSelfPermission(PhoneActivity.this, Manifest.permission.CALL_PHONE);
                if (checkPermission != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(
                            PhoneActivity.this,
                            new String[]{Manifest.permission.CALL_PHONE},
                            REQUEST_CALL_PHONE);
                }
                else if(position==0){
                    //position =1;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+115"));
                    startActivity(intent);
                }
                else if(position==1){
                   // position =0;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+116"));
                    startActivity(intent);
                }
                else if(position==2){
                    //position =2;
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+623-1300"));
                    startActivity(intent);
                }


                else {

                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+911"));
                    startActivity(intent);
                }


            }
        });


    }



}
