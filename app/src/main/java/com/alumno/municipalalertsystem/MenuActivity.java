package com.alumno.municipalalertsystem;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.github.kevinsawicki.http.HttpRequest;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;


public class MenuActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        new HttpREST().execute();

    }

    public void phone(View view) {
        Intent intent = new Intent(this, PhoneActivity.class);
        startActivity(intent);
    }

    public void sentmessage(View view) {
        Intent intent = new Intent(this, sentMessageActivity.class);
        startActivity(intent);
    }

    public void map(View view){
        Intent intent=new Intent(this,MapsActivity.class);
        startActivity(intent);
    }

    private class HttpREST extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... arg0) {

            Log.i("===>", "Dentro de doInBackground()");
            try {

                final ListView lstProductos = (ListView)findViewById(R.id.listView);

                HttpRequest httpRequest = HttpRequest.get("http://munical-alert.000webhostapp.com/rest_tienda/rest_tienda/index.php/news");

                String respuesta = httpRequest.body().toString();

                Log.i("===>", respuesta);

                Gson gson = new Gson();
                Type stringStringMap = new TypeToken<ArrayList<Map<String, Object>>>() {
                }.getType();
                final ArrayList<Map<String, Object>> retorno = gson.fromJson(respuesta, stringStringMap);

                final String[] matriz = new String[retorno.size()];
                int i = 0;

                for (Map<String, Object> x : retorno) {
                    matriz[i++] = (String) (x.get("newstitle") + " \n" + x.get("newsinformation"));
                }

                runOnUiThread(new Runnable() {
                    public void run() {
                        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                                MenuActivity.this,
                                android.R.layout.simple_list_item_1,
                                matriz);
                        lstProductos.setAdapter(adaptador);
                    }
                });

            } catch (Exception ex) {
                Log.e("===>", "Error: " + ex);
            }
            return null;
        }
    }



}
