package com.example.ahsan.robi360health.remote;

import com.example.ahsan.robi360health.model.MyPlaces;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface GoogleApiService {
    @GET
    Call<MyPlaces> getNearByPlaces(@Url String url);

}
