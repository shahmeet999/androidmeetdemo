package com.example.meet.newcalci;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class collectionDetails extends AppCompatActivity {


    TextView txtcollname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection_details);
        txtcollname= (TextView) findViewById(R.id.txtcolldetainame);

        Intent it=getIntent();
        String name=it.getStringExtra("coll_name");
       // String photo=it.getStringExtra("profile_photo");

        txtcollname.setText(name);
    }
}
