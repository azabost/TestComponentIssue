# Android Studio 3.6.1 test component issue reproduction #

If you open this project in Android Studio 3.5.3, open `MainActivityViewModelTest.kt` file, run the test, you will see there are no errors.

![Test ok](/test-ok.png)

![Test codegen ok](/test-codegen-ok.png)

But if you open the project in Android Studio 3.6.1 (you can also update the version of Android Gradle plugin to 3.6.1 in `build.gradle` file)
you will see the errors related to the Dagger generated test component in
`MainActivityViewModelTest.kt`.

![Test error](/test-error.png)

![Test codegen error](/test-codegen-error.png)

