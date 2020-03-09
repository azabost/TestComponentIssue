package com.azabost.testcomponentissue

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var vmFactory: ViewModelFactory<MainActivityViewModel>

    private lateinit var vm: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vm = ViewModelProvider(this, vmFactory).get(MainActivityViewModel::class.java)

        textView.text = vm.screenName
    }

    @Module
    interface ActivityModule {
        @ContributesAndroidInjector(modules = [ScreenNameModule::class])
        fun mainActivity(): MainActivity
    }

    @Module
    class ScreenNameModule {
        @Provides
        fun screenName(mainActivity: MainActivity): String {
            return mainActivity.javaClass.simpleName
        }
    }
}
