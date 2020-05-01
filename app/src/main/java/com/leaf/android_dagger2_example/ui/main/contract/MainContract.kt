package com.leaf.android_dagger2_example.ui.main.contract

import com.leaf.android_dagger2_example.ui.base.BasePresenter
import com.leaf.android_dagger2_example.ui.base.BaseView

class MainContract {
    interface View : BaseView<Presenter>

    interface Presenter : BasePresenter<View>
}