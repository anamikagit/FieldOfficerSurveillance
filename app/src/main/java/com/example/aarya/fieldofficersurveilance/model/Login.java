package com.example.aarya.fieldofficersurveilance.model;


import com.google.gson.annotations.SerializedName;

public class Login {

    @SerializedName("fo_id")
    String fo_id;

    @SerializedName("pwd")
    String pwd;

    @SerializedName("imei")
    String imei;
}
