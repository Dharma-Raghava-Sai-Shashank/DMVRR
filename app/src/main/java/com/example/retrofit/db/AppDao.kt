package com.example.retrofit.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.retrofit.Model.User

@Dao
interface AppDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
     suspend fun insertUsers(Users: kotlin.collections.List<com.example.retrofit.Model.User>?)

     @Query("SELECT*FROM User")
     suspend fun getUsers():List<User>

}