package com.alumno.municipalalertsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ForgetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget);
    }
    public void forgetsubmit(View view){
        Intent intent=new Intent(this,SuccessSenEmailActivity.class);
        startActivity(intent);
    }
}
