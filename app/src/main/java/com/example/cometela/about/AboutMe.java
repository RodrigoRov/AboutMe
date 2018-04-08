package com.example.cometela.about;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AboutMe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
    }


    public void Share(View v){
        Uri imagen = Uri.parse("android.resource://"+ getPackageName()+ "/drawable/" + "foto");
        Intent sharingIntent = new Intent(Intent.ACTION_SEND);
        String mensaje = "Sigueme en: \nFacebook: Rodrigo Rovelo \nGit: Rodrigo Rov \nWhatsApp: 7732 1729";
        sharingIntent.putExtra(Intent.EXTRA_SUBJECT,"Tarea de Labo");
        sharingIntent.putExtra(Intent.EXTRA_STREAM,imagen);
        sharingIntent.putExtra(Intent.EXTRA_TEXT,mensaje);
        sharingIntent.setType("*/*");
        sharingIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        startActivity(Intent.createChooser(sharingIntent,"Share via"));
    }

}
