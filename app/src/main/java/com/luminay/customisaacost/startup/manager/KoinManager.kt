package com.luminay.customisaacost.startup.manager

import android.content.Context
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class KoinManager(context: Context) {
    init {
        startKoin {
            androidContext(context)
            // Modules here
            modules()
        }
    }
}
