object Versions {
    object Build {
        const val kotlin = "1.3.20"
        const val agp = "3.3.0"
        const val bintray = "0.9"
    }

    object Dependencies {
        const val support = "27.1.1"
        const val glide = "4.7.1"

        object Test {
            const val jUnit = "4.12"
            const val assertJ1 = "1.7.0"
            const val assertJ2 = "2.9.1"
            const val jUnitParams = "1.1.0"
        }

        object UiTest {
            const val uiAutomator = "2.1.3"
            const val espresso = "3.0.2"
        }

        object Mockito {
            const val core = "2.13.0"
            const val kotlin = "1.5.0"
            const val android = "2.16.0"
        }
    }
}

object Deploy {
    const val userOrg = "schibstedspain"
    const val groupId = "com.schibsted.spain"
    const val artifactId = "barista"
    const val version = "2.7.1"
    const val desc = "The guy who serves a great Espresso"
    const val website = "https://github.com/SchibstedSpain/Barista"
}

object Build {
    const val kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.Build.kotlin}"
    const val androidGradleTools = "com.android.tools.build:gradle:${Versions.Build.agp}"
    const val novodaBintray = "com.novoda:bintray-release:${Versions.Build.bintray}"

    const val minSDK = 14
    const val compileSDK = 28

    const val testRunner = "android.support.test.runner.AndroidJUnitRunner"

    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.Build.kotlin}"
}

object Other {
    const val glide = "com.github.bumptech.glide:glide:${Versions.Dependencies.glide}"
}

object Tests {
    const val espressoCore = "com.android.support.test.espresso:espresso-core:${Versions.Dependencies.UiTest.espresso}"
    const val espressoContrib = "com.android.support.test.espresso:espresso-contrib:${Versions.Dependencies.UiTest.espresso}"
    const val uiAutomator = "com.android.support.test.uiautomator:uiautomator-v18:${Versions.Dependencies.UiTest.uiAutomator}"
    const val espressoIntents = "com.android.support.test.espresso:espresso-intents:${Versions.Dependencies.UiTest.espresso}"

    const val assertJ1 = "org.assertj:assertj-core:${Versions.Dependencies.Test.assertJ1}"
    const val assertJ2 = "org.assertj:assertj-core:${Versions.Dependencies.Test.assertJ2}"
    const val jUnitParams = "pl.pragmatists:JUnitParams:${Versions.Dependencies.Test.jUnitParams}"

    const val mockitoCore = "org.mockito:mockito-core:${Versions.Dependencies.Mockito.core}"
    const val mockitoKotlin = "com.nhaarman:mockito-kotlin:${Versions.Dependencies.Mockito.kotlin}"
    const val mockitoAndroid = "org.mockito:mockito-android:${Versions.Dependencies.Mockito.android}"

    const val jUnit = "junit:junit:${Versions.Dependencies.Test.jUnit}"
}

object SupportLib {
    const val annotations = "com.android.support:support-annotations:${Versions.Dependencies.support}"
    const val coreUi = "com.android.support:support-core-ui:${Versions.Dependencies.support}"
    const val animatedVectorDrawable = "com.android.support:animated-vector-drawable:${Versions.Dependencies.support}"
    const val recyclerView = "com.android.support:recyclerview-v7:${Versions.Dependencies.support}"
    const val v4 = "com.android.support:support-v4:${Versions.Dependencies.support}"
    const val appCompat = "com.android.support:appcompat-v7:${Versions.Dependencies.support}"
    const val design = "com.android.support:design:${Versions.Dependencies.support}"
}