// Inicia o Koin quando o app é criado

package com.joanna.androidmentoring

import android.app.Application
import com.joanna.androidmentoring.dependency.injection.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MentorshipApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MentorshipApplication)
            modules(appModule)
        }
    }
}