package com.example.meet.newcalci;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {

    AutoCompleteTextView txtloginmain3;
    EditText txtpassmain3;
    Button btnlogmain3,btnmain3back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        txtloginmain3= (AutoCompleteTextView) findViewById(R.id.txtemailmain3);

        txtpassmain3=(EditText) findViewById(R.id.txtpassmain3);

        btnlogmain3= (Button) findViewById(R.id.btnloginmain3);

        btnmain3back=(Button)findViewById(R.id.btnmain3back);

        btnmain3back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent itmain3=new Intent(Main3Activity.this,Main2Activity.class);
                startActivity(itmain3);

            }
        });
    }
}
