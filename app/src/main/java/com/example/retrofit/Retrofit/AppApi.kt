package com.example.retrofit.Retrofit

import androidx.lifecycle.LiveData
import com.example.retrofit.Model.User
import retrofit2.Response
import retrofit2.http.GET

interface AppApi
{

    @GET("about")
    suspend fun getUsers(): Response<List<User>>

}