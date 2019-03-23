package com.bank.town.dell.dagger2.di.presenterDi;

import com.bank.town.dell.dagger2.di.scope.ActivityScope;

import dagger.Component;

/**
 * Created by dell on 2019/3/23.
 */

@Component(modules = PresenterModule.class)
@ActivityScope
public interface PresenterComponent {
    public Presenter providePresenter();
//    void inject(HttpObject a);
}
