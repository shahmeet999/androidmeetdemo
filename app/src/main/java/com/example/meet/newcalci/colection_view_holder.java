package com.example.meet.newcalci;

import android.widget.TextView;

/**
 * Created by Meet on 22-May-17.
 */

public class colection_view_holder {

    TextView txtcol_name;

    public colection_view_holder(TextView txtcol_name) {
        this.txtcol_name = txtcol_name;
    }

    public TextView getTxtcol_name() {
        return txtcol_name;
    }

    public void setTxtcol_name(TextView txtcol_name) {
        this.txtcol_name = txtcol_name;
    }
}
