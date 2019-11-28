package com.www.mvvmexample.ui.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity<V extends BaseViewModel> extends AppCompatActivity {

    private V viewModel;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(provideLayoutId());
      /*  setupObservers();
        setupView(savedInstanceState);
        viewModel.create();*/
    }

    public abstract int provideLayoutId();

}
