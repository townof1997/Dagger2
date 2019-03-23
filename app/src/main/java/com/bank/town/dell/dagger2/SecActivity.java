package com.bank.town.dell.dagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.bank.town.dell.dagger2.di.MyApplication;

import javax.inject.Inject;

public class SecActivity extends AppCompatActivity {
//    @Inject
//    User user;

    @Inject
    HttpObject httpObject;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

//        DaggerAppComponent.create().injectSecActivity(this);
        ((MyApplication)getApplication()).getAppComponent().injectSecActivity(this);
//        Log.i("Jett", "Sec" + user.hashCode() + "");
        Log.i("Jett", "Sec" + httpObject.hashCode() + "");
    }
}
