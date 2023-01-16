package com.example.retrofit.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.retrofit.Repository.AppRepository
import javax.inject.Inject

class MainViewModelFactory @Inject constructor(var appRepository: AppRepository):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(appRepository)as T
    }
}