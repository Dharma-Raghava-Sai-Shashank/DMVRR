package com.example.retrofit.db
import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.retrofit.Model.User

@Database(entities = [User::class], version = 1)
 abstract class Database:RoomDatabase(){

     abstract fun appdao():AppDao

}