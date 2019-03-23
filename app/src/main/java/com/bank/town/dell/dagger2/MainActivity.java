package com.bank.town.dell.dagger2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.bank.town.dell.dagger2.di.MyApplication;
import com.bank.town.dell.dagger2.di.presenterDi.Presenter;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
//    @Inject
//    User user;
//
//    @Inject
//    User user2;

    @Inject
    HttpObject httpObject;

    @Inject
    HttpObject httpObject2;

    @Inject
    DatabaseObject databaseObject;

    @Inject
    Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        DaggerAppComponent.create().injectMainActivity(this);
        ((MyApplication)getApplication()).getAppComponent().injectMainActivity(this);

//        DaggerUserComponent.create().injectMainActivity(this);
//        UserComponent userComponent = DaggerUserComponent.builder()
//                .userModule(new UserModule())
//                .build();
//        userComponent.injectMainActivity(this);
        //内存中已经产生了Module和Component
//        Log.i("Jett",user.hashCode() + "" + user2.hashCode() );
        Log.i("Jett",httpObject.hashCode()
                + "" + httpObject2.hashCode() + databaseObject.hashCode()
                        + presenter .hashCode());
    }

    public void click(View view) {
        Intent intent = new Intent(this,SecActivity.class);
        startActivity(intent);
    }
}
