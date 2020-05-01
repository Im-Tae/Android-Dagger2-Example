package com.leaf.android_dagger2_example.ui.main

import android.os.Bundle
import android.widget.Toast
import com.leaf.android_dagger2_example.R
import com.leaf.android_dagger2_example.ui.base.BaseActivity
import com.leaf.android_dagger2_example.ui.main.contract.MainContract
import javax.inject.Inject

class MainActivity : BaseActivity(), MainContract.View {

    @Inject
    override lateinit var presenter : MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.setToastMessage()
    }

    override fun showToast(message: String) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}
