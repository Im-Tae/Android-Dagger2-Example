package com.leaf.android_dagger2_example.di.module

import com.leaf.android_dagger2_example.di.scope.ActivityScope
import com.leaf.android_dagger2_example.ui.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun mainActivity(): MainActivity
}