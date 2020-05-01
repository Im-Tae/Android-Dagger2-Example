package com.leaf.android_dagger2_example.ui.base

interface BasePresenter<T> {

    var view : T

    fun setToastMessage()
}