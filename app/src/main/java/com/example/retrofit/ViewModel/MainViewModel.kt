package com.example.retrofit.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofit.Model.User
import com.example.retrofit.Repository.AppRepository
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

class MainViewModel (var appRepository: AppRepository): ViewModel() {

    var b:MutableLiveData<Int> = MutableLiveData(0)
    fun increament()
    {
        b.value= b.value?.plus(1)
    }

    val Users: LiveData<List<User>>?
        get() =appRepository.Users
    init {
        viewModelScope.launch {
            appRepository.getUsers()
        }
    }
}