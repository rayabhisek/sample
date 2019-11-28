package com.www.mvvmexample.ui.login;


import com.www.mvvmexample.Reponsitory.UserRepository;
import com.www.mvvmexample.data.Remote.User;
import com.www.mvvmexample.data.result.LoginResponse;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LoginViewModel extends ViewModel {

    private UserRepository userRepository;
    //  private LiveData<LoginResponse> loginResponseLiveData;

    private MutableLiveData<LoginResponse> mutableLiveData;

    public void init() {

        if (mutableLiveData != null) {
            return;
        }
        userRepository = new UserRepository();
        User user = new User("probelalkhan@gmail.com", "123456");
        mutableLiveData = userRepository.login(user);

    }

    public MutableLiveData<LoginResponse> getMutableLiveData() {
        return mutableLiveData;
    }
}
