package com.bank.town.dell.dagger2.di;

import android.app.Application;

import com.bank.town.dell.dagger2.di.presenterDi.DaggerPresenterComponent;

/**
 * Created by dell on 2019/3/23.
 */

public class MyApplication extends Application {
    AppComponent appComponent;


    @Override
    public void onCreate() {
        super.onCreate();
        //全局变量 单例唯一
        appComponent = DaggerAppComponent.builder()//DaggerAppComponent.create();
                        .dataBaseModule(new DataBaseModule())
                .httpModule(new HttpModule())
                .presenterComponent(DaggerPresenterComponent.create())
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
