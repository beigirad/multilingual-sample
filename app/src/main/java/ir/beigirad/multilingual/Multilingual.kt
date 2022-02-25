package ir.beigirad.multilingual

import android.app.Application
import android.content.Context
import android.content.res.Configuration
import android.util.Log

class Multilingual : Application() {
    private val TAG = this.javaClass.simpleName

    override fun onCreate() {
        super.onCreate()
        Log.i(TAG, "onCreate: application")
    }

    override fun createConfigurationContext(overrideConfiguration: Configuration): Context {
        return super.createConfigurationContext(overrideConfiguration).also {
            Log.i(TAG, "createConfigurationContext: $overrideConfiguration")
        }
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        Log.i(TAG, "onConfigurationChanged: $newConfig")
    }
}