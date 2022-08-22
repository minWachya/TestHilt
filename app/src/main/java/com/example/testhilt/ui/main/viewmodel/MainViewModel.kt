package com.example.testhilt.ui.main.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.testhilt.data.remote.model.response.DogResponse
import com.example.testhilt.data.remote.repository.DogRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: DogRepository
) : ViewModel() {
    private val _response = MutableLiveData<DogResponse>()
    val response: LiveData<DogResponse> = _response

    init {
        fetchDogResponse()
    }

    private fun fetchDogResponse() = viewModelScope.launch {
        kotlin.runCatching {
            repository.getDog()
        }.onSuccess {
            _response.value = DogResponse(it.message, it.status)
        }.onFailure {
            Log.d("mmm get dog api fail", "${it.message}")
        }
    }

    fun clickBtnFetch() {
        fetchDogResponse()
    }
}