package com.example.meet.newcalci;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button btncalcmain2,btnloginmain2,btnsignupmain2,btnws,btnimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        btnimg= (Button) findViewById(R.id.btnmain2imgdis);

        btnws= (Button) findViewById(R.id.btnmain2data);

        btncalcmain2= (Button) findViewById(R.id.btnmain2calc);

        btnloginmain2=(Button) findViewById(R.id.btnmain2login);

        btnsignupmain2=(Button)findViewById(R.id.btnmain2signup);




        btnimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent itmainimg=new Intent(Main2Activity.this,imageDisplay.class);
                startActivity(itmainimg);


            }
        });

        btncalcmain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent itmain2=new Intent(Main2Activity.this,MainActivity.class);
                startActivity(itmain2);


            }
        });

        btnws.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent itmain9=new Intent(Main2Activity.this,allCollection.class);
                startActivity(itmain9);


            }
        });

        btnloginmain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent itmain2login=new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(itmain2login);

            }
        });

        btnsignupmain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent itmain2signup=new Intent(Main2Activity.this,Main4Activity.class);
                startActivity(itmain2signup);

            }
        });
    }

}
