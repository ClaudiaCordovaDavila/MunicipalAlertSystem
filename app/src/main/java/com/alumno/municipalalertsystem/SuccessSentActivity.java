package com.alumno.municipalalertsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SuccessSentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_sent);
    }

    public void successsubmitmessage(View view){
        Intent intent=new Intent(this,MenuActivity.class);
        startActivity(intent);
    }
}
