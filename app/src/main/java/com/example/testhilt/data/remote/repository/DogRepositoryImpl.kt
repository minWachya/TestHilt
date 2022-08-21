package com.example.testhilt.data.remote.repository

import com.example.testhilt.data.remote.datasource.DogDataSource
import com.example.testhilt.data.remote.model.BaseResponse
import com.example.testhilt.data.remote.model.response.DogResponse
import javax.inject.Inject

class DogRepositoryImpl @Inject constructor(
    private val dataSource: DogDataSource
) : DogRepository {
    override suspend fun getDog(): Result<BaseResponse<DogResponse>> = dataSource.getDog()
}