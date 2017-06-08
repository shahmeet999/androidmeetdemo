package com.example.meet.newcalci;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class imageDisplay extends AppCompatActivity {

    ImageView iv;
    URL url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_display);
        iv= (ImageView) findViewById(R.id.imgcolldetail);
        Picasso.with(imageDisplay.this).load("http://demo3.brainoorja.com/images/2.jpg").into(iv);

       /* try {
            url=new URL("http://demo3.brainoorja.com/images/2.jpg");
            Bitmap bmp= BitmapFactory.decodeStream(url.openConnection().getInputStream());
            iv.setImageBitmap(bmp);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
