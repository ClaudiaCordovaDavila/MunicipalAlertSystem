package com.alumno.municipalalertsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SuccessSenEmailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_sen_email);
    }
    public void emaillogin(View view){
        Intent intent=new Intent(this,LoginActivity.class);
        startActivity(intent);
    }
}
