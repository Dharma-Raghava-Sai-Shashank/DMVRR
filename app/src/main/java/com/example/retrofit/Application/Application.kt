package com.example.retrofit.Application

import android.app.Application
import com.example.retrofit.di.ApplicationComponent
import com.example.retrofit.di.DaggerApplicationComponent
import com.example.retrofit.di.DatabaseModule

class Application:Application() {

    lateinit var applicationComponent:ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        applicationComponent=DaggerApplicationComponent.builder().databaseModule(DatabaseModule(this)).build()

    }
}