package com.example.httpconnect;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MyAPI {

    //https://run.mocky.io/v3/ 69c2c95b-8162-4085-a41e-14882694699c

    @GET("69c2c95b-8162-4085-a41e-14882694699c")
    Call<DataModel>getData();

}
