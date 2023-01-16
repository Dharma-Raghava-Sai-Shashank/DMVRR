package com.example.retrofit.di

import android.content.Context
import androidx.room.Room
import com.example.retrofit.db.AppDao
import com.example.retrofit.db.Database
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule(var context: Context) {

    @Singleton
    @Provides
    fun providesDatabase():Database= Room.databaseBuilder(context,Database::class.java,"App Data").build()

} 