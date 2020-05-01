package com.leaf.android_dagger2_example.di.component

import com.leaf.android_dagger2_example.di.app.MyApplication
import com.leaf.android_dagger2_example.di.module.ActivityModule
import com.leaf.android_dagger2_example.di.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AppModule::class,
        ActivityModule::class
    ]
)

interface AppComponent : AndroidInjector<MyApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: MyApplication) : Builder
        fun build() : AppComponent
    }

//    @Component.Factory
//    interface Factory {
//        fun create(@BindsInstance application: MyApplication): AppComponent
//    }
}