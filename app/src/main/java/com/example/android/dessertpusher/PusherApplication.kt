package com.example.android.dessertpusher

import android.app.Application
import timber.log.Timber

class PusherApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        //setting up timber in our application class
        Timber.plant(Timber.DebugTree())
    }
}