package com.www.mvvmexample.data.Remote;

import com.www.mvvmexample.data.result.LoginResponse;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiInterface {

    @Headers({
            "Content-Type:application/json"
    })
    @POST(ApiEndPoint.ENDPOINT_SERVER_LOGIN)
    Call<LoginResponse> login(@Body User user);


}
