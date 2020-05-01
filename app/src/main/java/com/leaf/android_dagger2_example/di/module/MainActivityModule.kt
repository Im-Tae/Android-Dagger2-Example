package com.leaf.android_dagger2_example.di.module

import com.leaf.android_dagger2_example.ui.main.MainActivity
import com.leaf.android_dagger2_example.ui.main.contract.MainContract
import com.leaf.android_dagger2_example.ui.main.presenter.MainPresenter
import dagger.Binds
import dagger.Module

@Module
abstract class MainActivityModule {

    @Binds
    abstract fun provideMainPresenter(presenter : MainPresenter) : MainContract.Presenter

    @Binds
    abstract fun provideMainView(view : MainActivity) : MainContract.View
}