package com.example.testhilt.data.remote.service

import com.example.testhilt.data.remote.model.BaseResponse
import com.example.testhilt.data.remote.model.response.DogResponse
import retrofit2.http.GET

interface DogService {
    @GET("api/breeds/image/random")
    suspend fun getDog(): Result<BaseResponse<DogResponse>>
}