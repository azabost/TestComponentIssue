package com.azabost.testcomponentissue

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(val screenName: String) : ViewModel()
