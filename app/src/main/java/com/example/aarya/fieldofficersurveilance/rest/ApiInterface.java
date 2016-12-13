package com.example.aarya.fieldofficersurveilance.rest;

import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("/sgm_android/WebService.asmx/insertfolochist")
    Call<List<Response>> sendGpsData
            (@Query("lat") String latitude,
             @Query("lon") String longitude,
             @Query("imei") String imei,
             @Query("battery") String battery,
             @Query("date_time") String dateTime,
             @Query("Accurate") String accurate,
             @Query("Panic") String panic,
             @Query("Speed") String speed,
             @Query("location") String location,
             @Query("Direction") String direction);
}
