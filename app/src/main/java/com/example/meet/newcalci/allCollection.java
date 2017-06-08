package com.example.meet.newcalci;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import cz.msebera.android.httpclient.Header;

public class allCollection extends AppCompatActivity {

    ListView mListView;
    ArrayList<collection> mArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_collection);

        mListView= (ListView) findViewById(R.id.listcollection);
        mArrayList=new ArrayList<collection>();

        AsyncHttpClient mClient=new AsyncHttpClient();

     mClient.get(allCollection.this,"https://reunirbackend.herokuapp.com/collection/",new JsonHttpResponseHandler(){

         ProgressDialog mProgress;

         @Override
         public void onSuccess(int statusCode, Header[] headers, JSONArray response) {
             super.onSuccess(statusCode, headers, response);

                 JSONArray mJSONArray = response;
                 JSONObject mJsonObject;
             try {
             for(int i=0;i<mJSONArray.length();i++) {

                 mJsonObject = mJSONArray.getJSONObject(i);
                 mArrayList.add(new collection(Integer.parseInt(mJsonObject.getString("coll_id")),
                         mJsonObject.getString("coll_name"),
                         mJsonObject.getString("profile_photo"),
                         mJsonObject.getString("cover_photo"),
                         mJsonObject.getString("date"),
                         mJsonObject.getString("description")));
             }
                 }
                 catch (JSONException e) {
                     e.printStackTrace();
                 }
             mListView.setAdapter(new collection_custom_adapter(allCollection.this,mArrayList));
         }

         @Override
         public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONArray errorResponse) {
             super.onFailure(statusCode, headers, throwable, errorResponse);
         }

         @Override
         public void onStart() {
             super.onStart();
             mProgress=ProgressDialog.show(allCollection.this,"Loading","Please Wait",true,false);
         }

         @Override
         public void onFinish() {
             super.onFinish();

             if(mProgress.isShowing()){
                 mProgress.dismiss();
                 Toast.makeText(allCollection.this,"Done",Toast.LENGTH_LONG).show();
             }
         }
     });

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                collection mcoll= (collection) parent.getItemAtPosition(position);
                Intent it=new Intent(allCollection.this,collectionDetails.class);
                it.putExtra("coll_name",mcoll.getColl_name());
                it.putExtra("profile_photo",mcoll.getProfile_photo());
                startActivity(it);
            }
        });

    }
}
