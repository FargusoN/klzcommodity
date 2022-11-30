package com.jr.entry;

import java.sql.Date;

/**
 * @auther Summer
 * @create 2022-11-25-18:39
 */
public class Klz {
    private  int itemid;
    private String itemname;
    private  double itemprice;
    private Date mafactdate;
    private int shelflife;

    public Klz() {
    }

    public Klz(int itemid, String itemname, double itemprice, Date mafactdate, int shelflife) {
        this.itemid = itemid;
        this.itemname = itemname;
        this.itemprice = itemprice;
        this.mafactdate = mafactdate;
        this.shelflife = shelflife;
    }

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public double getItemprice() {
        return itemprice;
    }

    public void setItemprice(double itemprice) {
        this.itemprice = itemprice;
    }

    public Date getMafactdate() {
        return mafactdate;
    }

    public void setMafactdate(Date mafactdate) {
        this.mafactdate = mafactdate;
    }

    public int getShelflife() {
        return shelflife;
    }

    public void setShelflife(int shelflife) {
        this.shelflife = shelflife;
    }

    @Override
    public String toString() {
        return "Klz{" +
                "itemid=" + itemid +
                ", itemname='" + itemname + '\'' +
                ", itemprice=" + itemprice +
                ", mafactdate=" + mafactdate +
                ", shelflife=" + shelflife +
                '}';
    }

}
