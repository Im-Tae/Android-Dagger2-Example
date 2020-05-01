package com.leaf.android_dagger2_example.ui.main.presenter

import com.leaf.android_dagger2_example.ui.main.contract.MainContract
import javax.inject.Inject

class MainPresenter @Inject constructor(override var view: MainContract.View) : MainContract.Presenter {

    override fun setToastMessage() = view.showToast("Hello, World!")
}