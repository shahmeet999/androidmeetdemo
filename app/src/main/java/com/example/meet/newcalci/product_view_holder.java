package com.example.meet.newcalci;

import android.widget.TextView;

/**
 * Created by Meet on 22-May-17.
 */

public class product_view_holder {

    TextView tvpid;
    TextView tvpname;
    TextView tvpprice;

    public product_view_holder(TextView tvpid, TextView tvpname, TextView tvpprice) {
        this.tvpid = tvpid;
        this.tvpname = tvpname;
        this.tvpprice = tvpprice;
    }
}
