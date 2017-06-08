package com.example.meet.newcalci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class all_students extends AppCompatActivity {

    ListView mListView;
    ArrayList<student> mArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_students);

        mListView= (ListView) findViewById(R.id.lststudent);
        mArrayList=new ArrayList<student>();
        mArrayList.add(new student(1,1000,"meet"));
        mArrayList.add(new student(2,2000,"iron man"));
        mArrayList.add(new student(3,4000,"captain america"));
        mListView.setAdapter(new student_custom_adapter(all_students.this,mArrayList)); //all_students is context or else work as a view and araaylist is a data
    }
}
