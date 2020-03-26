package com.example.dengshuke0326.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.dengshuke0326.R;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        initView();
        initData();
    }

    protected abstract int getLayout();

    protected abstract void initView();


    protected abstract void initData();
}
