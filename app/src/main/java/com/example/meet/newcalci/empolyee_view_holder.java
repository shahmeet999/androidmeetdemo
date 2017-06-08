package com.example.meet.newcalci;

import android.view.View;
import android.widget.TextView;

/**
 * Created by Meet on 22-May-17.
 */

public class empolyee_view_holder {

    TextView tvid;
    TextView tvname;

    public empolyee_view_holder(TextView tvid, TextView tvname) {
        this.tvid = tvid;
        this.tvname = tvname;
    }



    public TextView getTvid() {
        return tvid;
    }

    public void setTvid(TextView tvid) {
        this.tvid = tvid;
    }

    public TextView getTvname() {
        return tvname;
    }

    public void setTvname(TextView tvname) {
        this.tvname = tvname;
    }
}
