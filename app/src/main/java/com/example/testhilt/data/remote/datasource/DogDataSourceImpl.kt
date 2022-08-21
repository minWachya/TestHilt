package com.example.testhilt.data.remote.datasource

import com.example.testhilt.data.remote.model.BaseResponse
import com.example.testhilt.data.remote.model.response.DogResponse
import com.example.testhilt.data.remote.service.DogService
import javax.inject.Inject

class DogDataSourceImpl @Inject constructor(private val dogService: DogService) : DogDataSource {
    override suspend fun getDog(): Result<BaseResponse<DogResponse>> = dogService.getDog()
}