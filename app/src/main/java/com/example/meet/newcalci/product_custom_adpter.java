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

public class product_custom_adpter extends BaseAdapter {

   Context mContext;
    ArrayList<product> mArrayList;
    LayoutInflater mLayoutInflater;

    public product_custom_adpter(Context mContext, ArrayList<product> mArrayList) {
        this.mContext = mContext;
        this.mArrayList = mArrayList;
        mLayoutInflater= (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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
    public View getView(int position, View view, ViewGroup ViewGroup) {

        product_view_holder  mItem;
        if(view==null)
        {
            view=mLayoutInflater.inflate(R.layout.product_view_holder,null);
            mItem=new product_view_holder((TextView) view.findViewById(R.id.lblproductid),
                    (TextView) view.findViewById(R.id.lblproductname),
                    (TextView) view.findViewById(R.id.lblproductprice));
            view.setTag(mItem);
        }
        else
        {
            mItem= (product_view_holder) view.getTag();
        }

        mItem.tvpid.setText(mArrayList.get(position).getProductid()+"");
        mItem.tvpname.setText(mArrayList.get(position).getProductname()+"");
        mItem.tvpprice.setText(mArrayList.get(position).getProductprice()+"");
        return view;
    }
}
