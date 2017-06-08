package com.example.meet.newcalci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class all_employee extends AppCompatActivity {


    ListView mListView;
    ArrayList<employee> mArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_employee);

        mListView= (ListView) findViewById(R.id.lstemployee);

        mArrayList=new ArrayList<employee>();

        mArrayList.add(new employee(1,"meet"));
        mArrayList.add(new employee(2,"iron man"));
        mArrayList.add(new employee(3,"jarvis"));

        mListView.setAdapter(new employee_custom_adapter(all_employee.this,mArrayList));
    }
}
