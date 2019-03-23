package com.bank.town.dell.dagger2.di.presenterDi;

import com.bank.town.dell.dagger2.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by dell on 2019/3/23.
 */
@Module
public class PresenterModule {
//    @Singleton
//    @ApplicationScope
    @ActivityScope
    @Provides
    public Presenter providePresenter(){
        return new Presenter();
    }
}
