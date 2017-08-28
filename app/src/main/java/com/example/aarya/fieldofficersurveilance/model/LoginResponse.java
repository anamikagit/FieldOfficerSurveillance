package com.example.aarya.fieldofficersurveilance.model;

import com.google.gson.annotations.SerializedName;

public class LoginResponse {
    @SerializedName("id")
    String id;

    @SerializedName("fo_id")
    String fo_id;

    @SerializedName("fo_name")
    String fo_name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFo_id() {
        return fo_id;
    }

    public void setFo_id(String fo_id) {
        this.fo_id = fo_id;
    }

    public String getFo_name() {
        return fo_name;
    }

    public void setFo_name(String fo_name) {
        this.fo_name = fo_name;
    }
}
