package com.example.daggerexample.di;

import android.app.Application;

import com.example.daggerexample.model.CourseShopRepository;
import com.example.daggerexample.viewmodel.MainActivityViewModelFactory;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RepositoryModule {

    @Singleton
    @Provides
    CourseShopRepository providesCourseShopRepository(Application application){
        return new CourseShopRepository(application);
    }

    @Singleton
    @Provides
    MainActivityViewModelFactory providesMainActivityViewModelFactory(CourseShopRepository repository) {
        return new MainActivityViewModelFactory(repository);
    }
}
