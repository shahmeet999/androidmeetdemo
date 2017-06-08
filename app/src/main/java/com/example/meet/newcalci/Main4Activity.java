package com.example.meet.newcalci;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {

    Button btnbackmain4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        btnbackmain4=(Button)findViewById(R.id.btnbackmain4);

        btnbackmain4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent itmain4=new Intent(Main4Activity.this,Main2Activity.class);
                startActivity(itmain4);

            }
        });
    }
}
