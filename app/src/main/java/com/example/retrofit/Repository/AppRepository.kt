package com.example.retrofit.Repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.retrofit.Model.User
import com.example.retrofit.Retrofit.AppApi
import com.example.retrofit.db.Database
import kotlinx.coroutines.launch
import javax.inject.Inject

class AppRepository @Inject constructor(val appApi: AppApi,val database: Database){
     var _Users:MutableLiveData<List<User>> = MutableLiveData()
     val Users: LiveData<List<User>>
          get() =_Users
     suspend fun getUsers() {
          _Users.postValue(appApi.getUsers().body())
          database.appdao().insertUsers(appApi.getUsers().body())
     }
}