package com.example.meet.newcalci;

/**
 * Created by Meet on 22-May-17.
 */

public class product {

    int productid;
    int productprice;
    String productname;

    public product(int productid, int productprice, String productname) {
        this.productid = productid;
        this.productprice = productprice;
        this.productname = productname;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getProductprice() {
        return productprice;
    }

    public void setProductprice(int productprice) {
        this.productprice = productprice;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }
}
