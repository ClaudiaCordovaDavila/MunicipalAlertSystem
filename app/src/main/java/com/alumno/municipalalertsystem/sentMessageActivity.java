package com.alumno.municipalalertsystem;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.io.File;

public class sentMessageActivity extends AppCompatActivity {

    private ImageButton btn_camera;
    private ImageView img;
    private static final int SELECT_FILE = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sent_message);

        //
        img = (ImageView)this.findViewById(R.id.mostrar);
        btn_camera = (ImageButton)this.findViewById(R.id.camera);

        btn_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cameraIntenet = new Intent(
                        MediaStore.ACTION_IMAGE_CAPTURE);
                File imagesFoler = new File(
                        Environment.getExternalStorageDirectory(),"guardar imagen");
                imagesFoler.mkdirs();
                File image = new File(imagesFoler,"foto,jpg");
                Uri uriSavedImage = Uri.fromFile(image);
                cameraIntenet.putExtra(MediaStore.EXTRA_OUTPUT, uriSavedImage);
                startActivityForResult(cameraIntenet,1);
            }
        });
    }

    public void abrirGaleria(View v){
        Intent intent = new Intent();
        intent.setType("/image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(
                Intent.createChooser(intent, "Seleccione una imagen"),
                SELECT_FILE);
    }

    public void submitmessage(View view) {
        Intent intent = new Intent(this, SuccessSentActivity.class);
        startActivity(intent);
    }
}
