package com.alumno.municipalalertsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

public void gotoforget(View view){
    Intent intent=new Intent(this,ForgetActivity.class);
            startActivity(intent);
}
    public void login(View view){
        Intent intent=new Intent(this,LoginActivity.class);
        startActivity(intent);
    }
    public void signup(View view){
        Intent intent=new Intent(this,SigninActivity.class);
        startActivity(intent);
    }
}
