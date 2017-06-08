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

public class collection_custom_adapter extends BaseAdapter{

    Context mContext;
    LayoutInflater mLayoutInflater;
    ArrayList<collection> mArrayList;

    public collection_custom_adapter(Context mContext, ArrayList<collection> mArrayList) {
        this.mContext = mContext;
        this.mArrayList = mArrayList;
        this.mLayoutInflater= (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return mArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        colection_view_holder mItem;

        if(convertView==null)
        {
            convertView=mLayoutInflater.inflate(R.layout.collection_view_holder,null);
            mItem= new colection_view_holder((TextView) convertView.findViewById(R.id.txtcoll_name));
            convertView.setTag(mItem);
        }
        else
        {
            mItem= (colection_view_holder) convertView.getTag();
        }
        mItem.txtcol_name.setText(mArrayList.get(position).getColl_name());
        return convertView;
    }
}
