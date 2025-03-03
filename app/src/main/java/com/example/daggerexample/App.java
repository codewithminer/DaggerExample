package com.example.daggerexample;

import android.app.Application;

import com.example.daggerexample.di.AppModule;
import com.example.daggerexample.di.CourseShopComponent;
import com.example.daggerexample.di.DaggerCourseShopComponent;
import com.example.daggerexample.model.CourseShopRepository;

public class App extends Application {
    private static App app;
    private CourseShopComponent courseShopComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        courseShopComponent = DaggerCourseShopComponent
                .builder()
                .appModule(new AppModule(this))
                .build();
    }

    public static App getApp(){
        return app;
    }

    public CourseShopComponent getCourseShopComponent() {
        return courseShopComponent;
    }
}
