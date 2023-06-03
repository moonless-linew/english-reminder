package ru.linew.englishreminder.ui.app

import android.app.Application
import com.google.android.material.color.DynamicColors
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class EnglishReminderApplication: Application() {
    override fun onCreate() {
        super.onCreate()
       // DynamicColors.applyToActivitiesIfAvailable(this)
    }
}