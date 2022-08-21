package com.example.testhilt.data.remote.repository

import com.example.testhilt.data.remote.model.BaseResponse
import com.example.testhilt.data.remote.model.response.DogResponse

interface DogRepository {
    suspend fun getDog(): Result<BaseResponse<DogResponse>>
}