package com.example.meet.newcalci;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Meet on 21-May-17.
 */

public class student_custom_adapter extends BaseAdapter {

    Context mContext;
    ArrayList<student> mArrayList;
    LayoutInflater mLayoutInflater;

    public student_custom_adapter(Context mContext, ArrayList<student> mArrayList) {
        this.mContext = mContext;
        this.mArrayList = mArrayList;
        this.mLayoutInflater= (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return mArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return mArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        student_view_holder mItem;

        if(view==null)
        {
            view=mLayoutInflater.inflate(R.layout.student_view_holder,null);//single view how it looks
            mItem=new student_view_holder(  (TextView)view.findViewById(R.id.lblstudentvwrno),
                                            (TextView)view.findViewById(R.id.lblstudentvwname),
                                            (TextView)view.findViewById(R.id.lblstudentvwfees)); //find by id from the single data design holder page
            view.setTag(mItem);
        }
        else
        {
            mItem= (student_view_holder) view.getTag();
        }

        mItem.tvrno.setText(mArrayList.get(i).getRno()+"");
        mItem.tvname.setText(mArrayList.get(i).getName());
        mItem.tvfees.setText(mArrayList.get(i).getFees()+"");

        return view;
    }
}
