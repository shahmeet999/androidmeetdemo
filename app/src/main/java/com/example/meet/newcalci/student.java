package com.example.meet.newcalci;

/**
 * Created by Meet on 21-May-17.
 */

public class student {

    int rno;
    int fees;
    String name;

    public student(int rno, int fees, String name) {
        this.rno = rno;
        this.fees = fees;
        this.name = name;
    }

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
