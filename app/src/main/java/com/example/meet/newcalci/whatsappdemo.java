package com.example.meet.newcalci;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class whatsappdemo extends AppCompatActivity {

    Button btn1,btnshare,btnshareWA,btnPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whatsappdemo);
        btn1= (Button) findViewById(R.id.txtemailbtn);
        btnshare= (Button) findViewById(R.id.btnShare);
        btnshareWA= (Button) findViewById(R.id.btnShareWhatsApp);
        btnPhone= (Button) findViewById(R.id.btnPhone);

        btnPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(Intent.ACTION_DIAL);
                it.setData(Uri.parse("tel:"+"9825889888"));
                startActivity(it);
            }
        });
        btnshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it1=new Intent(Intent.ACTION_SENDTO);
                it1.setData(Uri.parse("mailto:jinalshah999@gmail.com"));
                it1.putExtra(Intent.EXTRA_SUBJECT,"how r u");
                it1.putExtra(Intent.EXTRA_TEXT,"hello");
                startActivity(it1);
            }
        });
        btnshareWA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String urlToShare = "https://play.google.com/store/apps/details?id=com.facebook.katana&hl=en";
                try {
                    Intent mIntentFacebook = new Intent();
                    mIntentFacebook.setClassName("com.facebook.katana", "com.facebook.composer.shareintent.ImplicitShareIntentHandlerDefaultAlias");
                    mIntentFacebook.setAction("android.intent.action.SEND");
                    mIntentFacebook.setType("text/plain");
                    mIntentFacebook.putExtra("android.intent.extra.TEXT", urlToShare);
                    startActivity(mIntentFacebook);
                } catch (Exception e) {
                    e.printStackTrace();
                    Intent mIntentFacebookBrowser = new Intent(Intent.ACTION_SEND);
                    String mStringURL = "https://www.facebook.com/sharer/sharer.php?u=" + urlToShare;
                    mIntentFacebookBrowser = new Intent(Intent.ACTION_VIEW, Uri.parse(mStringURL));
                    startActivity(mIntentFacebookBrowser);
                }
            }
        });
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/html");
                intent.putExtra(Intent.EXTRA_EMAIL, "shahmeet199722@gmail.com");
                intent.putExtra(Intent.EXTRA_SUBJECT, "Mail Demo Check");
                intent.putExtra(Intent.EXTRA_TEXT, "I'm email body.");

                startActivity(Intent.createChooser(intent, "Send Email"));

            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
                sendIntent.setType("text/plain");
                startActivity(Intent.createChooser(sendIntent, getResources().getText(R.string.send_to)));

            }
        });
    }

}
