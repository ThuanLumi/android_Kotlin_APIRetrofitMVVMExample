package com.office.apiretrofitmvvmexample

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.office.apiretrofitmvvmexample.repository.Repository

class MainViewModelFactory(private val repository: Repository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }
}