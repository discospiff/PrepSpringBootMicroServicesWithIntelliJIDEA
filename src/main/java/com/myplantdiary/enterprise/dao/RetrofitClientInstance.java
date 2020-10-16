package com.myplantdiary.enterprise.dao;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance {

    public static Retrofit getInstance() throws Exception {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://plantplaces.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;
    }

}
