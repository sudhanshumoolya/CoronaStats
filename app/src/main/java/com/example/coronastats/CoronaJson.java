package com.example.coronastats;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class CoronaJson {
    @SerializedName("Active Cases_text")
     private String Active_Cases_text;
    @SerializedName("Country_text")
     private String Country_text;
    @SerializedName("Last Update")
     private String Last_Update;
    @SerializedName("New Cases_text")
     private String New_Cases_text;
    @SerializedName("New Deaths_text")
     private String New_Deaths_text;
    @SerializedName("Total Cases_text")
     private String Total_Cases_text;
    @SerializedName("Total Deaths_text")
     private String Total_Deaths_text;
    @SerializedName("Total Recovered_text")
     private String Total_Recovered_text;

    public CoronaJson(String active_Cases_text, String country_text, String last_Update, String new_Cases_text, String new_Deaths_text, String total_Cases_text, String total_Deaths_text, String total_Recovered_text) {
        Active_Cases_text = active_Cases_text;
        Country_text = country_text;
        Last_Update = last_Update;
        New_Cases_text = new_Cases_text;
        New_Deaths_text = new_Deaths_text;
        Total_Cases_text = total_Cases_text;
        Total_Deaths_text = total_Deaths_text;
        Total_Recovered_text = total_Recovered_text;
    }

    public String getActive_Cases_text() {
        return Active_Cases_text;
    }

    public String getCountry_text() {
        return Country_text;
    }

    public String getLast_Update() {
        return Last_Update;
    }

    public String getNew_Cases_text() {
        return New_Cases_text;
    }

    public String getNew_Deaths_text() {
        return New_Deaths_text;
    }

    public String getTotal_Cases_text() {
        return Total_Cases_text;
    }

    public String getTotal_Deaths_text() {
        return Total_Deaths_text;
    }

    public String getTotal_Recovered_text() {
        return Total_Recovered_text;
    }

    public void setActive_Cases_text(String active_Cases_text) {
        Active_Cases_text = active_Cases_text;
    }

    public void setCountry_text(String country_text) {
        Country_text = country_text;
    }

    public void setLast_Update(String last_Update) {
        Last_Update = last_Update;
    }

    public void setNew_Cases_text(String new_Cases_text) {
        New_Cases_text = new_Cases_text;
    }

    public void setNew_Deaths_text(String new_Deaths_text) {
        New_Deaths_text = new_Deaths_text;
    }

    public void setTotal_Cases_text(String total_Cases_text) {
        Total_Cases_text = total_Cases_text;
    }

    public void setTotal_Deaths_text(String total_Deaths_text) {
        Total_Deaths_text = total_Deaths_text;
    }

    public void setTotal_Recovered_text(String total_Recovered_text) {
        Total_Recovered_text = total_Recovered_text;
    }
}
