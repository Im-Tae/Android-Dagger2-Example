package com.leaf.android_dagger2_example.ui.base

interface BaseView<T> {

    val presenter : T

    fun showToast(message: String)
}