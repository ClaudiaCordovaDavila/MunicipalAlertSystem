package com.alumno.municipalalertsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class sentMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sent_message);
    }

    //submitmessage

    public void submitmessage(View view){
        Intent intent=new Intent(this,SuccessSentActivity.class);
        startActivity(intent);
    }
}
