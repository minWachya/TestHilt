package com.example.testhilt.data.remote.datasource

import com.example.testhilt.data.remote.model.BaseResponse
import com.example.testhilt.data.remote.model.response.DogResponse

interface  DogDataSource {
    suspend fun getDog(): Result<BaseResponse<DogResponse>>
}