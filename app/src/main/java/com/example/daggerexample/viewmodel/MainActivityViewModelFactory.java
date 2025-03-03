package com.example.daggerexample.viewmodel;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.daggerexample.model.CourseShopRepository;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class MainActivityViewModelFactory implements ViewModelProvider.Factory {

    private final CourseShopRepository courseShopRepository;


    public MainActivityViewModelFactory(CourseShopRepository courseShopRepository) {
        this.courseShopRepository = courseShopRepository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new MainActivityViewModel(courseShopRepository);
    }
}
