package com.example.testhilt.di

import com.example.testhilt.data.remote.datasource.DogDataSource
import com.example.testhilt.data.remote.datasource.DogDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface DataSourceModule {

    @Binds
    @Singleton
    fun bindsDogDataSource(dataSourceImpl: DogDataSourceImpl): DogDataSource
}