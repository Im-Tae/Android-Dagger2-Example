package com.leaf.android_dagger2_example.di.module

import android.app.Application
import android.content.Context
import com.leaf.android_dagger2_example.di.app.MyApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {
    @Provides
    @Singleton
    fun provideContext(application: MyApplication): Context = application

    @Provides
    @Singleton
    fun provideApplication(application: MyApplication): Application = application
}