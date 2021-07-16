package com.example.fetch;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MyInterface {
    @GET("horoscope/today/{input}")
    Call<String> getValue(@Path("input") String i);
}
