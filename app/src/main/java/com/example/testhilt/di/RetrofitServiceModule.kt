package com.example.testhilt.di

import com.example.testhilt.data.remote.service.DogService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RetrofitServiceModule {
    @Provides
    @Singleton
    fun provideDogService(retrofit: Retrofit): DogService =
        retrofit.create(DogService::class.java)
}