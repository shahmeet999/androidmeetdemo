package com.example.meet.newcalci;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Meet on 22-May-17.
 */

public class employee_custom_adapter extends BaseAdapter {

    Context mContext;
    ArrayList<employee> mArrayList;
    LayoutInflater mLayoutInflater;

    public employee_custom_adapter(Context mContext, ArrayList<employee> mArrayList) {
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

        empolyee_view_holder mItem;

        if(view==null)
        {
            view=mLayoutInflater.inflate(R.layout.employee_view_holder,null);
            mItem=new empolyee_view_holder((TextView)view.findViewById(R.id.lblempeid),
                                            (TextView)view.findViewById(R.id.lblempname));
            view.setTag(mItem);
        }
        else
        {
            mItem= (empolyee_view_holder) view.getTag();
        }

        mItem.tvid.setText(mArrayList.get(i).getId()+"");
        mItem.tvname.setText(mArrayList.get(i).getName());

        return view;
    }
}
