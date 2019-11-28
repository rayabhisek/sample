package com.www.mvvmexample.Reponsitory;

import android.util.Log;

import com.www.mvvmexample.data.Remote.ApiInterface;
import com.www.mvvmexample.data.Remote.RetrofitInstance;
import com.www.mvvmexample.data.Remote.User;
import com.www.mvvmexample.data.result.LoginResponse;

import androidx.lifecycle.MutableLiveData;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserRepository {

    private ApiInterface apiInterface;

    public UserRepository() {
        this.apiInterface = RetrofitInstance.getRetrofitInstance().create(ApiInterface.class);
    }

    public MutableLiveData<LoginResponse> login(User user) {

        final MutableLiveData<LoginResponse> data = new MutableLiveData<>();
        apiInterface.login(user)
                .enqueue(new Callback<LoginResponse>() {
                    @Override
                    public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {

                        if (response.body() != null) {
                            data.setValue(response.body());
                            Log.d("TAG", response.body().toString());
                        }
                    }

                    @Override
                    public void onFailure(Call<LoginResponse> call, Throwable t) {

                    }
                });
        return data;
    }
}
