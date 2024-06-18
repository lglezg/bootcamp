package com.example.bootcamp.di

import com.example.bootcamp.data.remote.BootcampApi
import com.example.bootcamp.data.repository.HomeRepositoryImpl
import com.example.bootcamp.domain.repository.HomeRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun  provideHomeRepository(
        api: BootcampApi
    ): HomeRepository {
        return HomeRepositoryImpl(api)
    }


}