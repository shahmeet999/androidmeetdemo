package com.example.meet.newcalci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class getall_product extends AppCompatActivity {


    ArrayList<product> mArrayList;
    ListView mListView;


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Action");
        menu.add(0,v.getId(),0,"Hello");
        menu.add(0,v.getId(),2,"ABC");
        menu.add(1,v.getId(),1,"het");
        menu.add(1,v.getId(),3,"rutul");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {


        if(item.getTitle()=="Hello")
        {

            Toast.makeText(getApplicationContext(),"Hello Code",Toast.LENGTH_SHORT).show();
        }else if(item.getTitle()=="ABC")
        {
            Toast.makeText(getApplicationContext(),"Hello ABC",Toast.LENGTH_SHORT).show();
        }
        else if(item.getTitle()=="het"){
            Toast.makeText(getApplicationContext(),"Hello het",Toast.LENGTH_SHORT).show();
        }
        else if(item.getTitle()=="rutul"){
            Toast.makeText(getApplicationContext(),"Hello rutul",Toast.LENGTH_SHORT).show();
        }
        else
        {
            return  false;
        }
        return  true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getall_product);

        mListView= (ListView) findViewById(R.id.lstallproduct);

        mArrayList=new ArrayList<product>();

        mArrayList.add(new product(1,50,"a"));
        mArrayList.add(new product(2,20,"b"));
        mArrayList.add(new product(3,40,"c"));

        mListView.setAdapter(new product_custom_adpter(getall_product.this,mArrayList));

        registerForContextMenu(mListView);



    }
}
