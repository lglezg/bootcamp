package com.example.bootcamp.di

import com.example.bootcamp.data.use_case.FirstPageUseCaseImpl
import com.example.bootcamp.domain.repository.HomeRepository
import com.example.bootcamp.domain.use_case.FirstPageUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object UsesCaseModule {

    @Provides
    @ViewModelScoped
    fun provideFirstPageUseCase(
        homeRepository: HomeRepository
    ): FirstPageUseCase {
        return FirstPageUseCaseImpl(
            homeRepository
        )
    }
}