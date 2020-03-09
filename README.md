# Android Studio 3.6.1 test component issue reproduction #

Open the project in Android Studio 3.6.1 to see the errors related to the Dagger generated test component in
`MainActivityViewModelTest.kt`.

![Test error](/test-error.png)

![Test codegen error](/test-codegen-error.png)

If you open the same project in Android Studio 3.5.3 and lower the Android Gradle plugin version to 3.5.3 in `build.gradle` file, the errors are gone.

![Test ok](/test-ok.png)

![Test codegen ok](/test-codegen-ok.png)
