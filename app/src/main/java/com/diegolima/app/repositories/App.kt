package br.com.diegolima.app.repositories

import android.app.Application
import br.com.diegolima.app.repositories.domain.di.DomainModule
import br.com.diegolima.app.repositories.presentation.di.PresentationModule
import br.com.diegolima.app.repositories.data.di.DataModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}