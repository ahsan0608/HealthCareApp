package com.example.ahsan.robi360health;

import com.example.ahsan.robi360health.remote.GoogleApiService;
import com.example.ahsan.robi360health.remote.RetrofitBuilder;

public class Common {
    private static final String BASE_URL = "https://maps.googleapis.com/";

    public static GoogleApiService getGoogleApiService() {
        return RetrofitBuilder.builder(BASE_URL).create(GoogleApiService.class);
    }
}
