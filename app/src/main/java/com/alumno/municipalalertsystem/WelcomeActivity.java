package com.alumno.municipalalertsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    private TextView usernameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        usernameText = (TextView)findViewById(R.id.usuario);
        usernameText.setText("Hola Usuario .....");
    }
    public void continue1(View view){
        Intent intent=new Intent(this,MenuActivity.class);
        startActivity(intent);
    }
}
