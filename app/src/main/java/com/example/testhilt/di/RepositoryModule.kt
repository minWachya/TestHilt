package com.example.testhilt.di

import com.example.testhilt.data.remote.repository.DogRepository
import com.example.testhilt.data.remote.repository.DogRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    @Singleton
    fun bindsDogRepository(repository: DogRepositoryImpl): DogRepository
}