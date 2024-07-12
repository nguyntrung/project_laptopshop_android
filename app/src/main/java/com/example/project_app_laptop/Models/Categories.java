package com.example.project_app_laptop.Models;

import java.util.ArrayList;

public class Categories {
    private int idhang;
    private String tenhang, logo;

    public Categories() {
    }

    public Categories(int idhang, String tenhang, String logo) {
        this.idhang = idhang;
        this.tenhang = tenhang;
        this.logo = logo;
    }

    public int getIdhang() {
        return idhang;
    }

    public void setIdhang(int idhang) {
        this.idhang = idhang;
    }

    public String getTenhang() {
        return tenhang;
    }

    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
    public static ArrayList<Categories> initData()
    {
        ArrayList<Categories> lst = new ArrayList<>();
        lst.add(new Categories(1, "MSI", "logomsi"));
        lst.add(new Categories(2, "LENOVO", "logolenovo"));
        lst.add(new Categories(3, "ASUS", "logoasus"));
        lst.add(new Categories(4, "DELL", "logodell"));
        lst.add(new Categories(5, "HP", "logohp"));
        lst.add(new Categories(6, "ACER", "logoacer"));
        lst.add(new Categories(0, "ALL", "cat5"));

        return lst;
    }
}
