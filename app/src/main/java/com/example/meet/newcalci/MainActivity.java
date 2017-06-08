package com.example.meet.newcalci;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnadd,btnsub,btnmul,btndiv,btneq,btnc,btnback;

    Button btnsin,btncos;
    EditText ed1;

    Editable txt;

    String txt1="";

    int n1=0,n2=0;

    int  flag;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnback= (Button) findViewById(R.id.btnmainback);
        btnc=(Button)findViewById(R.id.btnmainc);
        btneq=(Button)findViewById(R.id.btnmaineq);
        btn1=(Button)findViewById(R.id.btnmain1);
        btn2=(Button)findViewById(R.id.btnmain2);
        btn3=(Button)findViewById(R.id.btnmain3);
        btn4=(Button)findViewById(R.id.btnmain4);
        btn5=(Button)findViewById(R.id.btnmain5);
        btn6=(Button)findViewById(R.id.btnmain6);
        btn7=(Button)findViewById(R.id.btnmain7);
        btn8=(Button)findViewById(R.id.btnmain8);
        btn9=(Button)findViewById(R.id.btnmain9);
        btn0=(Button)findViewById(R.id.btnmain0);
        btnadd=(Button)findViewById(R.id.btnmainpl);
        btnsub=(Button)findViewById(R.id.btnmainmin);
        btnmul=(Button)findViewById(R.id.btnmainmul);
        btndiv=(Button)findViewById(R.id.btnmaindiv);
        btncos= (Button) findViewById(R.id.btnmaincos);

btnsin= (Button) findViewById(R.id.btnmainsin);

        ed1=(EditText)findViewById(R.id.txtmainno);



        btncos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt1=ed1.getText()+"";
                if(txt1.equals(""))
                {
                    ed1.setText("Cannot empty");
                }
                else {

                    n1 = (Integer.parseInt(ed1.getText() + ""));

                    ed1.setText(Math.cos(n1) + "");
                }
            }
        });

        btnsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n1=(Integer.parseInt(ed1.getText()+""));

                ed1.setText(Math.sin(n1)+"");

            }
        });

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent itmain=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(itmain);

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ed1.setText(ed1.getText()+""+btn1.getText());
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ed1.setText(ed1.getText()+""+btn2.getText());
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ed1.setText(ed1.getText()+""+btn3.getText());
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ed1.setText(ed1.getText()+""+btn4.getText());
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ed1.setText(ed1.getText()+""+btn5.getText());
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ed1.setText(ed1.getText()+""+btn6.getText());
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ed1.setText(ed1.getText()+""+btn7.getText());
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ed1.setText(ed1.getText()+""+btn8.getText());
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ed1.setText(ed1.getText()+""+btn9.getText());
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ed1.setText(ed1.getText()+""+btn0.getText());
            }
        });

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n1=(Integer.parseInt(ed1.getText()+""));
                ed1.setText("");
                flag=1;
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n1=(Integer.parseInt(ed1.getText()+""));
                ed1.setText("");
                flag=2;
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n1=(Integer.parseInt(ed1.getText()+""));
                ed1.setText("");
                flag=3;
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n1=(Integer.parseInt(ed1.getText()+""));
                ed1.setText("");
                flag=4;
            }
        });


        btneq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n2=(Integer.parseInt(ed1.getText()+""));
                if(flag==1)
                {
                    ed1.setText(n1+n2+"");
                }
                else if(flag==2)
                {
                    ed1.setText(n1-n2+"");
                }
                else if(flag==3)
                {
                    ed1.setText(n1*n2+"");
                }
                else
                {
                    ed1.setText(n1/n2+"");
                }
            }
        });

        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ed1.setText("");
            }
        });



    }
}
