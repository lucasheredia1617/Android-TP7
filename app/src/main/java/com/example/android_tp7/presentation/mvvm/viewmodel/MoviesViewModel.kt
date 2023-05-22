package com.example.android_tp7.presentation.mvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MoviesViewModel(private val model: MoviesModel) : ViewModel() {

    private val mutableLiveData: MutableLiveData<MainData> = MutableLiveData()
    fun getValue(): LiveData<MainData> = mutableLiveData

    fun callService() = viewModelScope.launch {
        withContext(Dispatchers.IO) { model.getMovies() }.let { result ->
            when (result) {
                is CoroutineResult.Success -> {
                    mutableLiveData.value = MainData(MainStatus.SHOW_INFO, result.data)
                }
                is CoroutineResult.Failure -> {
                    mutableLiveData.value = MainData(MainStatus.ERROR, exception = result.exception)
                }
            }
        }
    }


    data class MainData(
        val status: MainStatus,
        val movies: List<Movie> = emptyList(),
        val exception: Exception? = null,
    )

    enum class MainStatus {
        SHOW_INFO,
        ERROR
    }
}