package com.bank.town.dell.dagger2.di;

import com.bank.town.dell.dagger2.DatabaseObject;
import com.bank.town.dell.dagger2.di.scope.ApplicationScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by dell on 2019/3/23.
 */

@Module
public class DataBaseModule {
//    @Singleton
    @ApplicationScope
    @Provides
    public DatabaseObject provideUser(){
        return new DatabaseObject();
    }
}
