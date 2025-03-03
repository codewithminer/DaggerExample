package com.example.daggerexample.di;

import com.example.daggerexample.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, RepositoryModule.class})
public interface CourseShopComponent {

    void inject(MainActivity mainActivity);
}
