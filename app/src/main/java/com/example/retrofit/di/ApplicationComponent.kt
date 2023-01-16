package com.example.retrofit.di

import android.content.Context
import com.example.retrofit.Activity.MainActivity
import com.example.retrofit.ViewModel.MainViewModel
import dagger.BindsInstance
import dagger.Component
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class,DatabaseModule::class])
interface ApplicationComponent{

    fun inject(mainActivity: MainActivity)

}