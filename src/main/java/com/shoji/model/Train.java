package com.shoji.model;

/**
 * Created by m9003300 on 10/30/2016.
 */
public class Train
{
    private int store;
    private String day_of_week;
    private String date;
    private int sales;
    private String customers;
    private String open;
    private String promo;
    private String state_holiday;
    private String school_holiday;

    public int getStore() { return store; }

    public void setStore(int store) {
        this.store = store;
    }

    public String getDay_of_week() {
        return day_of_week;
    }

    public void setDay_of_week(String day_of_week) {
        this.day_of_week = day_of_week;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public String getCustomers() {
        return customers;
    }

    public void setCustomers(String customers) {
        this.customers = customers;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getPromo() {
        return promo;
    }

    public void setPromo(String promo) {
        this.promo = promo;
    }

    public String getState_holiday() {
        return state_holiday;
    }

    public void setState_holiday(String state_holiday) {
        this.state_holiday = state_holiday;
    }

    public String getSchool_holiday() {
        return school_holiday;
    }

    public void setSchool_holiday(String school_holiday) {
        this.school_holiday = school_holiday;
    }
}
