package com.luminay.customisaacost.startup.initializer

import android.content.Context
import androidx.startup.Initializer
import com.luminay.customisaacost.startup.manager.KoinManager

class KoinInitializer : Initializer<KoinManager> {
    override fun create(context: Context): KoinManager {
        return KoinManager(context)
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }
}
