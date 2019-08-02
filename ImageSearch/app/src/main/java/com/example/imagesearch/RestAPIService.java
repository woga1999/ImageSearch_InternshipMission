package com.example.imagesearch;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface RestAPIService {
    String API_KEY = "KakaoAK 6cd0785d345fa1ff8f6af5e41c44a493";
    String Url = "https://dapi.kakao.com";
    int size = 2;

    @GET("/v2/search/image")
    Call<JsonObject> getResult(@Header("Authorization") String API_KEY, @Query("query") String search, @Query("size") int size);
}