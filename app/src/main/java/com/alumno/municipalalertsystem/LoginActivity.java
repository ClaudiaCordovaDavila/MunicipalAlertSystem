package com.alumno.municipalalertsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.alumno.municipalalertsystem.models.Usuario;

public class LoginActivity extends AppCompatActivity {

    private Button btnlogin;
    private EditText user;
    private EditText password;
    private TextView loginError;
    private ProgressBar progressBar;

    private static final String login_url = "http://munical-alert.000webhostapp.com/rest_tienda/rest_tienda/classes/dao/UserDao.php";

    private static final String TAG_SUCESS ="success";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = (EditText)findViewById(R.id.username_input);
        password = (EditText)findViewById(R.id.password_input);
        btnlogin = (Button)findViewById(R.id.btnlogin);
        loginError = (TextView)findViewById(R.id.error);


    }

    public void login(View view){
        goWelcome();
    }

    private void goWelcome(){
        startActivity(new Intent(this, WelcomeActivity.class));
        finish();
    }

}
