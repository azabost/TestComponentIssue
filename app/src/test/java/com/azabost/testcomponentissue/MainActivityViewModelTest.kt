package com.azabost.testcomponentissue

import dagger.BindsInstance
import dagger.Component
import org.junit.Assert
import org.junit.Test
import javax.inject.Singleton

@Singleton
@Component
interface MainActivityViewModelTestComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun set(screenName: String): Builder
        fun build(): MainActivityViewModelTestComponent
    }

    fun getViewModel(): MainActivityViewModel
}

class MainActivityViewModelTest {

    private val componentBuilder = DaggerMainActivityViewModelTestComponent.builder()

    private fun getViewModel(screenName: String): MainActivityViewModel {
        return componentBuilder
            .set(screenName)
            .build()
            .getViewModel()
    }

    @Test
    fun screen_name_should_be_injected() {
        val vm = getViewModel("a")
        Assert.assertEquals(vm.screenName, "a")
    }
}