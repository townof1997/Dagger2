package com.bank.town.dell.dagger2.di.scope;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by dell on 2019/3/23.
 */
@Scope
@Documented
@Retention(RUNTIME)
public @interface ActivityScope {

}
